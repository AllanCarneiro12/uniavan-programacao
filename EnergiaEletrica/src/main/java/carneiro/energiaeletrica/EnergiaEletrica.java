
package carneiro.energiaeletrica;

import java.util.Scanner;

public class EnergiaEletrica {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        double kWh, valor, preco;
        double acrescimo = 20;
        double desconto = 10;
        double desKWH, acresKWH;

        System.out.print("Consumo (kWh): ");
        kWh = kb.nextDouble();

        System.out.print("Valor do kWh (R$): ");
        preco = kb.nextDouble();
        
        System.out.print("a patir de quantos kWh haverá acrescimo? ");
        acresKWH = kb.nextDouble();
        System.out.print("ate quantos kWh haverá desconto? ");
        desKWH = kb.nextDouble();
        
        System.out.print("Acrescimo (%): ");
        acrescimo = kb.nextDouble();
        System.out.print("Desconto (%): ");
        desconto = kb.nextDouble();
        
        valor = kWh*preco;
        if (kWh < desKWH){
            valor -= valor*desconto/100;
        } else if (kWh > acresKWH) {
            valor += valor*acrescimo/100;
        }

        System.out.printf("Valor a pagar: R$%.2f", valor);
    }
}
