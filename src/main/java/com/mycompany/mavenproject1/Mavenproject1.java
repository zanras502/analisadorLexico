
package com.mycompany.mavenproject1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Mavenproject1 {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        
        try {
            Reader r = new FileReader("prueba.txt");
            
            analizadorLexico analizadorLexico = new analizadorLexico(r);
            analizadorLexico.yylex();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
