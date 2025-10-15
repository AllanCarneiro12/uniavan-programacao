
package carneiro.exemplomodolarizacao2;

import java.util.Scanner;

public class ExemploModolarizacao2 {

    public static int leituraIdade(int idadeMinima, int idadeMaxima) {
        Scanner kb = new Scanner(System.in);

        int idade;

        while (true) {
            System.out.print("Digite sua idade: ");
            idade = kb.nextInt();
            if (idade >= idadeMinima && idade <= idadeMaxima) {
                return idade;
            }
            System.out.println("Idade inválida! Tente novamente.");
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int idadeMinima;
        int idadeMaxima;

        System.out.print("Digite a idade mínima: ");
        idadeMinima = kb.nextInt();

        System.out.print("Digite a idade máxima: ");
        idadeMaxima = kb.nextInt();


        int idade = leituraIdade(idadeMinima, idadeMaxima);

        System.out.println("Idade lida: " + idade);
    }
}
