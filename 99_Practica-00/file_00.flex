import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.FileNotFoundException;
%%
%class FernandezPerez
%standalone
%{ 
 /* Código personalizado */
  
// private int c = 0;
 
%}
%init{
 /* Código que se ejecutará en el constructor de la clase */
	/*Codigo para redirigir la salida a un archivo .html 
			--TODO habria que añadir "throws FileNotFoundException"
			desde aqui y en el escaner de la clase java :MdtoHTML(java.io.Reader in) 
	*/
//	File file = new File("salida.html");
//	FileOutputStream fos = new FileOutputStream(file);
//	PrintStream ps = new PrintStream(fos);
//	System.setOut(ps);
	////
 	System.out.println("<!DOCTYPE html><html>");
 	System.out.println("<head>");
 	System.out.println("<title>MarkDown2HTML</title>");
 	System.out.println("<style> ");
 	System.out.println("	.bold {font-weight: bold;} ");
 	System.out.println("	.ital {font-style: italic;}");
 	System.out.println("</style>");
 	System.out.println("</head><body> ");

%init}

/*Prueba para lanzar la excepcion comentada arriba*/
//%initthrow{
//		"FileNotFoundException"
//%initthrow}
%eof{
 
 /* Código a ejecutar al finalizar el análisis */
	
	System.out.println("</body></html>");
 
%eof}
/* Inicio de Expresiones regulares */
 CualquierCosa = [.|\n]*
 Digito = [0-9]
 Numero = {Digito} {Digito}*
 Letra = [A-Za-z]
 LetrasDigitos = ({Letra} | {Digito})+
 LetrasDigitosBarra = ({Letra} | {Digito} | "/")+
 Palabra = {Letra} {Letra}* 
 Espacio = " "

 FinDeLinea = \r|\n|\r\n
 Caracteres = [^\r\n]
 CaracteresSinCorchete = [^\r\n"[""]"]
 CaracSinParentesisSinCorchete = [^\r\n"("")""[""]"]
 
 Tag_h1 = "# " [^#\n]+ {FinDeLinea} //# seguido de todo menos # o \n y que acabe en fin de linea
 Tag_h2 = "## " [^#\n]+ {FinDeLinea}
 Tag_h3 = "### " [^#\n]+ {FinDeLinea}
 Tag_h4 = "#### " [^#\n]+ {FinDeLinea}
 Tag_h5 = "##### " [^#\n]+ {FinDeLinea}
 Tag_h6 = "###### " [^#\n]+ {FinDeLinea}
 
 Bold = "**" [^*] ~"**"
 Bold2 = "__" [^_] ~"__"
 Ital = "*" [^*]+ "*"
 Ital2 = "_" [^_]+ "_"
 
 Cita = "> "{Caracteres}* {FinDeLinea}?
 Separador = "***"{FinDeLinea} | "---"{FinDeLinea} | "___"{FinDeLinea}
 
 Code = "~~~" {CualquierCosa} ~"~~~" //Si lo metes en la misma linea tb lo reconoce 

AnidarItalenBold = "**" [^*\n_]* "_" [^_\n]* "_" [^*\n_]* "**"
AnidarBoldenItal = "_" [^*\n_]* "**" [^*\n]* "**" [^*\n_]* "_"

Http = "http://" | "https://"
Href = "[" {CaracteresSinCorchete}* "]" "(" {CaracSinParentesisSinCorchete}* ")"
HrefCompl = "[" {CaracteresSinCorchete}* "]" "(" {Http} ({LetrasDigitos} ".")? {LetrasDigitos} "." {LetrasDigitosBarra} ")"

Lista  = "- " [^\n]+ {FinDeLinea}
ListaN = {Lista} {Lista}+

/* Finaliza expresiones regulares */
%%

{Separador}	{
				System.out.println("<hr/>");
			}

{Tag_h6} {		String cadena = yytext();
				//cadena=cadena.replace("#","");
				cadena = cadena.substring(6,yylength()-2);//Recortamos yytext quitandole las # y el \n del final.(dejo el espacio inicial)				
				System.out.print("<h6>"+cadena+"</h6>");
				System.out.println();
			}
{Tag_h5} {		String cadena = yytext();
				//cadena=cadena.replace("#","");
				cadena = cadena.substring(5,yylength()-2);
				System.out.print("<h5>"+cadena+"</h5>");
				System.out.println();
			}
{Tag_h4} {		String cadena = yytext();
				//cadena=cadena.replace("#","");
				cadena = cadena.substring(4,yylength()-2);
				System.out.print("<h4>"+cadena+"</h4>");
				System.out.println();
			}
{Tag_h3} {		String cadena = yytext();
				//cadena=cadena.replace("#","");
				cadena = cadena.substring(3,yylength()-2);
				System.out.print("<h3>"+cadena+"</h3>");
				System.out.println();
			}
{Tag_h2} {		String cadena = yytext();
				//cadena=cadena.replace("#","");
				cadena = cadena.substring(2,yylength()-2);
				System.out.print("<h2>"+cadena+"</h2>");
				System.out.println();
			}
{Tag_h1} {		String cadena = yytext();
				//cadena=cadena.replace("#","");
				cadena = cadena.substring(1,yylength()-2);
				System.out.print("<h1>"+cadena+"</h1>");
				System.out.println();//Se le añade para meter el \n que le quitamos con substring
			}

{AnidarBoldenItal}	{
						String cadenAux,cadena = yytext();
						int c = 0;
						while (cadena.charAt(c)!='*'){
							c++;
						}
						cadenAux = cadena.substring(1,c);
						System.out.print("<SPAN class=\"ital\">"+cadenAux);
						cadena = cadena.substring(c+2,cadena.length());
						c=0;
						while (cadena.charAt(c)!='*'){
							c++;
						}
						cadenAux= cadena.substring(0,c);
						System.out.print("<SPAN class=\"bold\">"+cadenAux+"</SPAN>");
						cadena = cadena.substring(c+2,cadena.length()-1);
						System.out.print(cadena+"</SPAN>");						
					}

{AnidarItalenBold}	{
						String cadenAux,cadena = yytext();
						int c=0;
						while (cadena.charAt(c)!='_'){
							c++;
						}
						cadenAux = cadena.substring(2,c);
						System.out.print("<SPAN class=\"bold\">"+cadenAux);
						cadena = cadena.substring(c+1,cadena.length());
						c=0;
						while (cadena.charAt(c)!='_'){
							c++;
						}
						cadenAux= cadena.substring(0,c);
						System.out.print("<SPAN class=\"ital\">"+cadenAux+"</SPAN>");
						cadena = cadena.substring(c+1,cadena.length()-2);
						System.out.print(cadena+"</SPAN>");						
					}
{Bold} | {Bold2}	{
				String cadena = yytext();
				cadena = cadena.substring(2,yylength()-2);
				//cadena=cadena.replace("*","");
				//cadena=cadena.replace("_","");
				System.out.print("<SPAN class=\"bold\">"+cadena+"</SPAN>");

			}

{Ital} | {Ital2}	{
				String cadena = yytext();
				cadena=cadena.substring(1,yylength()-1);
				//cadena=cadena.replace("*","");
				//cadena=cadena.replace("_","");
				System.out.print("<SPAN class=\"ital\">"+cadena+"</SPAN>");

			}

{Cita}		{	String cadena = yytext();
				cadena=cadena.replace(">","	");
				System.out.println("<blockquote>\n"+cadena+"</blockquote>");
			}

{Code}		{
				String cadena = yytext();
				cadena=cadena.replace("~","");
				System.out.println("<code> <pre>"+cadena+"</pre></code>");
			}
{ListaN}	{
				String cadena = yytext();
				String cadenAux;
				int c;
				System.out.println("<ul>");
				while (!cadena.isEmpty()){
					if (cadena.charAt(0)=='-'){
						c=1;
						while (cadena.charAt(c)!='\n'){
							c++;
						}
						cadenAux = cadena.substring(1,c-1);
						System.out.println("<li>"+cadenAux+"</li>");
						cadena = cadena.substring(c+1,cadena.length());
					}else {
						cadena=cadena.substring(1,cadena.length());
					}
				}				
				System.out.print("</ul>");
			}

{Lista}		{
				String cadena = yytext();
				cadena = cadena.substring(1,yylength()-2);
				System.out.print("<ul><li>"+cadena+"</li></ul>");
			}

{HrefCompl}	{
				String url="",text="";
				String cadena = yytext();
				int length = cadena.length();
				for (int i = 1 ;i<length ;i++ ) {					
					if (cadena.charAt(i)==']'){
						url = cadena.substring(i+2,length-1);
						text = cadena.substring(1,i);
					}					
				}
				System.out.print("<A HREF=\""+url+ "\">");
				System.out.print(text);
				System.out.print("</A><br>");//<br> introduccido para que al verlo como html salte de linea ya que <a> no lo hace

			}

{Href}		{
				String url="",text="";
				String cadena = yytext();
				int length = cadena.length();
				for (int i = 1 ;i<length ;i++ ) {					
					if (cadena.charAt(i)==']'){
						url = cadena.substring(i+2,length-1);
						text = cadena.substring(1,i);
					}					
				}
				System.out.print("<A HREF=\""+url+ "\">");
				System.out.print(text+"(URL aparentemente incorrecta)");
				System.out.print("</A><br>");
			}


{FinDeLinea} {System.out.println("");}


//[^] {/*Ignorar*/} Si no reconoce ningun patron standalone lo mostrara por la salida
