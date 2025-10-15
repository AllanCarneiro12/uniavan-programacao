
package carneiro.exemplomodolarizacao1;

import java.util.Scanner;

public class ExemploModolarizacao1 {

    public static void mostrarMensagem(String nome, int idade, int[] v) {
        System.out.println("\n\nOlá " + nome + ", você tem " + idade + " anos.");

        for (int i = 0; i < v.length; i++) {
            System.out.println("v[" + i + "] = " + v[i]);
        }
    }

    public static int leituraIdade() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = kb.nextInt();
        return idade;
    }

    public static void main(String[] args) {

        String nome = "João";
        int[] v = {1, 2, 3, 4, 5};
        
        int idade = leituraIdade();
        

        System.out.println("Idade lida: " + idade);
        mostrarMensagem(nome, idade, v);
    }
}
