%%

%standalone

%%

[a-z]+ {System.out.println(yytext().toUpperCase());}
[^a-z]+ {System.out.println(yytext());}