/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package carneiro.somarmatriz;

/**
 *
 * @author Samsung
 */
public class SomarMatriz {

    public static void main(String[] args) {

        int[][] numeros = {
        {10, 60, 70, 51, 48, 4 , 1},
        {12, 6 , 92, 87, 11, 3 , 4},
        {25, 10, 33, 68, 71, 43, 18},
        {70, 8 , 45, 1 , 21, 69, 40},
        {8 , 75, 50, 2 , 10, 7 , 15},
        {15, 20, 80, 3 , 20, 8 , 20}};

        int somaVermelho = 0;
        int somaVerde = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(i+" "+j + "\t");
                if (i >= j) {
                    somaVermelho += numeros[i][j];
                }
                if ( i + j <= 6 && j >= i ) {
                    somaVerde += numeros[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Soma dos elementos vermelhos: " + somaVermelho);
        System.out.println("Soma dos elementos verdes: " + somaVerde);
    }
}
