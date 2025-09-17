/*
 * 
 */
package carneiro.matriz3x3;

/**
 * Implementar um programa que permita o usuário preencher uma matriz quadrada
 * 3x3 e depois imprimir os valores encontrados;
 */

import java.util.Scanner;

public class Matriz3x3 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = kb.nextInt();
            }
        }

        System.out.println("Matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
