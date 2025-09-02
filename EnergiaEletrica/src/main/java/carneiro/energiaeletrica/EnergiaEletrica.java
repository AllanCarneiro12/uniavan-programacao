
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
        
        valor = kWh/2;
        if (kWh < 50){
            valor -= valor*desconto/100;
        } else if (kWh > 200) {
            valor += valor*acrescimo/100;
        }

        System.out.printf("Valor a pagar: R$%.2f", valor);
    }
}
