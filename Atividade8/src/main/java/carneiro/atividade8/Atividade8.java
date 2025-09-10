package carneiro.atividade8;

import java.util.Scanner;
import java.util.Random;

public class Atividade8 {

    public static void main(String[] args) {
        final int TAMANHO = 5;
        int[] vetor = new int[TAMANHO];
        Scanner kb = new Scanner(System.in);
        Random aleatorio = new Random();

        int temp;

        for (int i = 0; i < TAMANHO; i++) {
            vetor[i] = aleatorio.nextInt(10);
        }

        System.out.println("Vetor: ");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print(vetor[i] + " ");
        }

        temp = vetor[2];
        vetor[2] = vetor[3];
        vetor[3] = temp;

        System.out.println("\nVetor apos troca: ");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
