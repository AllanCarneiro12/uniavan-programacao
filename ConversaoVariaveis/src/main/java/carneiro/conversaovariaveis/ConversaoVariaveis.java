
package carneiro.conversaovariaveis;

import java.util.Scanner;
        
public class ConversaoVariaveis {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int inteiro;
        double flutuante;
        
        System.out.println("insira um inteiro:");
        inteiro = kb.nextInt();
        System.out.println("insira um double");
        flutuante = kb.nextDouble();
        
        System.out.println("Inteiro: "+inteiro+"\nDouble: "+flutuante);
        
        flutuante = inteiro;
        
        System.out.println("Inteiro: "+inteiro+"\nDouble: "+flutuante);
        kb.close();
    }
}
