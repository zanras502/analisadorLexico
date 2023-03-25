//User code
package com.mycompany.mavenproject1;

%%

//Opciones y definiciones
%public
%class analizadorLexico
%char
%line
%column
%standalone

//Definición regular
letra = [a-zA-Z]

%%

//Reglas léxicas
{letra} {System.out.println("Lexema: " + yytext() + " columna:  " + yychar + " fila:  " + yyline);}
