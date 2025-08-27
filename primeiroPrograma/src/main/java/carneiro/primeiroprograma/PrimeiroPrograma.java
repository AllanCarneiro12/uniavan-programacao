
package carneiro.primeiroprograma;

import java.util.Scanner;

public class PrimeiroPrograma{

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        /*int valor;
        int valorTotal = 1000;
        
        long populacao = 7000000000L;
        
        //float peso;
        //float altura = 1.82f;
        
        double metragem = 456.78;;;
        
        char sexo = 'M';
        //byte idade = 30;
        
        short ano = 2025;
        
        boolean carro = true;
        carro = false;
        
        String nome = "Allan";*/
        
        String nome;
        int idade;
        double peso, altura, imc;
        
        nome = kb.next();
        idade = kb.nextInt();
        altura = kb.nextDouble();
        peso = kb.nextDouble();
        
        imc = peso / (altura*altura);
        
        System.out.println(imc);
        
    }
}
