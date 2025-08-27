
package carneiro.calculosaula;

import java.util.Scanner;

public class CalculosAula {

    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        int numero;
        System.out.println("Insira um numero: ");
        numero = kb.nextInt();
        
        System.out.println("Sucessor: "+(numero+1)+"\nAntecessor: "+(numero-1));
        
        double num1, num2, media;
        System.out.println("Insira dois numero reais: ");
        num1 = kb.nextDouble();
        num2 = kb.nextDouble();
        
        media = (num1 + num2) / 2;
        
        System.out.println("Soma: "+(num1+num2)+"\nMedia: "+media);
    }
}
