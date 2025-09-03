
package carneiro.numeroaleatorio;

import java.util.Random;

public class NumeroAleatorio {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Random aleatorio = new Random();
        
        int numAleatorio;
        
        numAleatorio = aleatorio.nextInt(10);
        
        System.out.println("\n numero gerado: "+numAleatorio);
    }
}
