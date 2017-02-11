%%
%class MdtoHTML
%standalone
%{
 
 /* Código personalizado */
 
 
 private int c = 0;
 
%}
%init{
 /* Código que se ejecutará en el constructor de la clase */
 	System.out.println("<!DOCTYPE html><html>");
 	System.out.println("<head>");
 	System.out.println("<title>MarkDown2HTML</title>");
 	System.out.println("<style> ");
 	System.out.println("	.bold {font-weight: bold;} ");
 	System.out.println("	.ital {font-style: italic;}");
 	System.out.println("</style>");
 	System.out.println("</head><body> ");

%init}
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
 Simbolo = "*"|"+"|"-"|"/"|"#"
 Espacio = " "

 FinDeLinea = \r|\n|\r\n
 Caracteres = [^\r\n]

 TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
 Tag_h1 = "#" [^#]*"#" 
 Tag_h2 = "##" [^#]* "##"
 Tag_h3 = "###" [^#]* "###"
 Tag_h4 = "####" [^#]* "####"
 Tag_h5 = "#####" [^#]* "#####"
 Tag_h6 = "######" [^#]* "######"
 Bold = "**" [^*] ~"**"
 Bold2 = "__" [^_] ~"__"
 Ital = "*" [^*]+ "*"
 Ital2 = "_" [^_]+ "_"
 Cita = "> "{Caracteres}* {FinDeLinea}?
 Separador = "***"{FinDeLinea} | "---"{FinDeLinea} | "___"{FinDeLinea}
 
 Code = "~~~" {CualquierCosa} ~"~~~"

 AnidarItalenBold = "**" [^*]* Ital2 [^*]* "**"
Http = "http://" | "https://"
Href = "[" {Caracteres}* "]" "(" {Caracteres}* ")"
HrefCompl = "[" {Caracteres}* "]" "(" {Http} ({LetrasDigitos} ".")? {LetrasDigitos} "." {LetrasDigitosBarra} ")"


/* Finaliza expresiones regulares */
%%

{Separador}	{
				System.out.println("<hr/>");
			}

{Tag_h6} {		String cadena = yytext();
				cadena=cadena.replace("#","");
				System.out.print("<h6>"+cadena+"</h6>");
			}
{Tag_h5} {		String cadena = yytext();
				cadena=cadena.replace("#","");
				System.out.print("<h5>"+cadena+"</h5>");
			}
{Tag_h4} {		String cadena = yytext();
				cadena=cadena.replace("#","");
				System.out.print("<h4>"+cadena+"</h4>");
			}
{Tag_h3} {		String cadena = yytext();
				cadena=cadena.replace("#","");
				System.out.print("<h3>"+cadena+"</h3>");
			}
{Tag_h2} {		String cadena = yytext();
				cadena=cadena.replace("#","");
				System.out.print("<h2>"+cadena+"</h2>");
			}
{Tag_h1} {		String cadena = yytext();
				cadena=cadena.replace("#","");
				System.out.print("<h1>"+cadena+"</h1>");
			}

{AnidarItalenBold}	{
						System.out.println(yytext()+"YESS");
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

{FinDeLinea} {System.out.println();}

{TraditionalComment} {	String cadena = yytext();
						cadena.substring(4, yylength()-4);
						cadena=cadena.replace("*","");
						System.out.print("----->"+ yytext()+"\n");
						
						System.out.print("<h1>"+cadena+"</h1>");}

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
				System.out.print("</A>");
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
				System.out.print("</A>");
			}




[^] {/*Ignorar*/}
