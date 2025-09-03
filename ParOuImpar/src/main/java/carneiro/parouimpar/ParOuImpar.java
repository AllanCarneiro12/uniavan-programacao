package carneiro.parouimpar;

import java.util.Scanner;
import java.util.Random;

public class ParOuImpar {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner kb = new Scanner(System.in);
        Random aleatorio = new Random();

        int nPlayer, nPc;
        char opcao;

        System.out.println("par ou impar?(P/I)");
        opcao = kb.next().toUpperCase().charAt(0);
        nPc = aleatorio.nextInt(10);

        System.out.println("escolha um numero: ");
        nPlayer = kb.nextInt();

        if ((opcao == 'P' && (nPlayer + nPc) % 2 == 0) || (opcao == 'I' && (nPlayer + nPc) % 2 != 0)) {
            System.out.println("Voce ganhou!\n numero computador: " + nPc + " (" + (nPlayer + nPc) + ")");  
        } else {
            System.out.println("Voce perdeu!\n numero computador: " + nPc + " (" + (nPlayer + nPc) + ")");
        }
    }
}
