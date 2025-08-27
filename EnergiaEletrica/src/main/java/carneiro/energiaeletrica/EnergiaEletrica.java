
package carneiro.energiaeletrica;

import java.util.Scanner;

public class EnergiaEletrica {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        double kWh, valor;
        double acrescimo = 20;
        double desconto = 10;

        System.out.print("Consumo (kWh): ");
        kWh = kb.nextDouble();

        if (kWh < 50){
            valor = kWh/2 - kWh*desconto/100;
        } else if (kWh > 200) {
            //TODO erro no acrescimo, somando 40%
            valor = kWh/2 + kWh*acrescimo/100;
        } else {
            valor = kWh/2;
        }

        System.out.printf("Valor a pagar: R$%.2f", valor);
    }
}
