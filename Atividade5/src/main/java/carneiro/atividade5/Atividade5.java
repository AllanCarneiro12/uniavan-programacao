package carneiro.atividade5;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int numero, countImpar = 0, countPar = 0, countNumero = 0, soma = 0;
        float media;

        System.out.println("digitar um numero: ");
        numero = kb.nextInt();
        if (numero != 0) {
            countNumero++;
            if (numero % 2 == 0) {
                countPar++;
            } else {
                countImpar++;
            }
            soma += numero;
        }

        while (numero != 0) {
            System.out.println("digitar um numero: ");
            numero = kb.nextInt();
            if (numero != 0) {
                countNumero++;
                if (numero % 2 == 0) {
                    countPar++;
                } else {
                    countImpar++;
                }
                soma += numero;
            }

        }
        media = (float)soma / countNumero;
        
        System.out.println("quantidade de numeros: " + countNumero);
        System.out.println("quantidade de numeros pares: " + countPar);
        System.out.println("quantidade de numeros impares: " + countImpar);
        System.out.println("media dos numeros: " + media);

    }
}
