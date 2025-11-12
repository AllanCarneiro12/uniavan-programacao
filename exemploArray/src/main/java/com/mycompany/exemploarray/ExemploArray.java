package com.mycompany.exemploarray;

import java.util.Arrays;

public class ExemploArray {

    public static void main(String[] args) {
        
        // ARRAYS DE INTEIROS

        int[] numeros = {5, 2, 9, 1, 3};

        System.out.println("Array original: " + Arrays.toString( numeros ) );

        // Ordenar o array
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString( numeros ) );

        // Buscar um elemento (busca binária - exige array ordenado)
        int posicao = Arrays.binarySearch( numeros , 3 );
        System.out.println("Posição do número 3: " + posicao );

        // Preencher todo o array com um valor
        int[] preenchido = new int[ 5 ];
        Arrays.fill( preenchido , 7 );
        System.out.println("Array preenchido com 7: " + Arrays.toString( preenchido ) );

        // Comparar dois arrays
        int[] outroArray = { 1 , 2 , 3 , 5 , 9 };
        boolean iguais = Arrays.equals( numeros , outroArray );
        System.out.println("Arrays são iguais? " + iguais );

        // Copiar e recortar arrays
        int[] copia = Arrays.copyOf( numeros , numeros.length );
        System.out.println("Cópia do array: " + Arrays.toString( copia ) );

        int[] parte = Arrays.copyOfRange( numeros , 1 , 4 );
        System.out.println("Parte do array (índices 1 a 3): " + Arrays.toString( parte ) );

        // Array bidimensional
        int[][] matriz = { {1 , 2 } , { 3 , 4 } };
        System.out.println("Matriz: " + Arrays.deepToString( matriz ) );


        // ARRAYS DE STRINGS

        String[] nomes = { "Carlos" , "Amanda" , "Bruno" , "Daniela" , "Eduardo" };
        System.out.println("\nArray original de nomes: " + Arrays.toString( nomes ) );

        // Ordenar (ordem alfabética)
        Arrays.sort( nomes );
        System.out.println("Array ordenado: " + Arrays.toString( nomes ) );

        // Buscar uma string (array precisa estar ordenado)
        int posicaoNome = Arrays.binarySearch( nomes , "Daniela" );
        System.out.println("Posição de 'Daniela': " + posicaoNome );

        // Preencher com a mesma string
        String[] convidados = new String[ 4 ];
        Arrays.fill( convidados , "Convidado" );
        System.out.println("Array preenchido: " + Arrays.toString( convidados ) );

        // Comparar dois arrays
        String[] outrosNomes = { "Amanda" , "Bruno" , "Carlos" , "Daniela" , "Eduardo" };
        boolean iguaisNomes = Arrays.equals( nomes , outrosNomes );
        System.out.println("Arrays de nomes são iguais? " + iguaisNomes );

        // copiar array
        String[] copiaNomes = Arrays.copyOf( nomes , nomes.length );
        System.out.println("Cópia de nomes: " + Arrays.toString( copiaNomes ) );

        // Copiar parte de um array
        String[] primeirosNomes = Arrays.copyOfRange( nomes , 0 , 3 );
        System.out.println("Primeiros três nomes: " + Arrays.toString( primeirosNomes ) );


        // ARRAYS DE CARACTERES (char)

        char[] letras = { 'Z' , 'A' , 'E' , 'C' , 'B' };
        System.out.println("\nArray original de letras: " + Arrays.toString( letras ) );

        // Ordenar (ordem alfabética)
        Arrays.sort(letras);
        System.out.println("Array de letras ordenado: " + Arrays.toString( letras ) );

        // Buscar uma letra (array precisa estar ordenado)
        int posicaoLetra = Arrays.binarySearch( letras , 'C' );
        System.out.println("Posição da letra 'C': " + posicaoLetra );

        // Preencher com o mesmo caractere
        char[] simbolos = new char[ 5 ];
        Arrays.fill( simbolos , '*' );
        System.out.println("Array de símbolos preenchido: " + Arrays.toString( simbolos ) );

        // Comparar dois arrays de caracteres
        char[] outrasLetras = { 'A' , 'B' , 'C' , 'E' , 'Z' };
        boolean iguaisLetras = Arrays.equals( letras , outrasLetras );
        System.out.println("Arrays de letras são iguais? " + iguaisLetras );

        // Copiar parte de um array de caracteres
        char[] primeirasLetras = Arrays.copyOfRange( letras , 0 , 3 );
        System.out.println("Três primeiras letras: " + Arrays.toString( primeirasLetras ) );

        // Converter para String
        String textoLetras = new String( letras );
        System.out.println("Array de letras como texto: " + textoLetras );
    }
}
