

package com.mycompany.exemplocharacterstring;

public class ExemploCharacterString {

    public static void main(String[] args) {
        
          
        // STRING 
        String texto = "Aprender Java é legal!";

        System.out.println("\n*** MÉTODOS DE STRING ***\n");

        System.out.println("Texto original: " + texto);
        System.out.println("Comprimento do texto: " + texto.length() );
        System.out.println("Texto em maiúsculas: " + texto.toUpperCase() );
        System.out.println("Texto em minúsculas: " + texto.toLowerCase() );
        System.out.println("Primeira letra: " + texto.charAt( 0 ) );
        System.out.println("Contém a palavra 'Java'? " + texto.contains( "Java" ) );
        System.out.println("Índice da palavra 'Java': " + texto.indexOf( "Java" ) );
        System.out.println("Subtexto (do 9 ao 13): " + texto.substring( 9 , 13 ) );
        System.out.println("Texto trocando 'legal' por 'fácil': " + texto.replace( "legal" , "fácil" ) );
        System.out.println("Texto começa com 'Aprender'? " + texto.startsWith( "Aprender" ) );
        System.out.println("Texto termina com '!'? " + texto.endsWith( "!" ) );
        System.out.println("Texto sem espaços nas pontas: '" + texto.trim() + "'");
        System.out.println("Texto dividido por espaços:");
       
        String[] palavras = texto.split(" ");
        
        for (String palavra : palavras) {
            System.out.println(" - " + palavra );
        }

        //  CHARACTER 
        System.out.println("\n\n*** MÉTODOS DE CHARACTER ***\n");

        char letra   = 'A';
        char digito  = '8';
        char simbolo = '#';
        char espaco  = ' ';

        System.out.println("Letra: " + letra) ;
        System.out.println("É letra? " + Character.isLetter( letra ) );
        System.out.println("É dígito? " + Character.isDigit( letra ) );
        System.out.println("É maiúscula? " + Character.isUpperCase( letra ) );
        System.out.println("Minúscula correspondente: " + Character.toLowerCase( letra ) );

        System.out.println("\nDígito: " + digito );
        System.out.println("É letra? " + Character.isLetter( digito ) );
        System.out.println("É dígito? " + Character.isDigit( digito ) );

        System.out.println("\nSímbolo: " + simbolo );
        System.out.println("É letra ou dígito? " + Character.isLetterOrDigit( simbolo ) );

        System.out.println("\nEspaço: '" + espaco + "'");
        System.out.println("É espaço em branco? " + Character.isWhitespace( espaco ) );
    }
}
