%%
%class Contador
%standalone
%{
 
 /* Código personalizado */
 
 
 private int c = 0;
 
%}
%eof{
 
 /* Código a ejecutar al finalizar el análisis */
	
	System.out.println("las ocurrencias de palabra son :" + c);
 
%eof}
%%

"palabra" {	System.out.println(yytext());
			c=c+1;}

