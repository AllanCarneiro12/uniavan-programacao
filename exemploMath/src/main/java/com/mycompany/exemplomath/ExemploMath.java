package com.mycompany.exemplomath;

public class ExemploMath {


    public static void main(String[] args) {
        
        double a = 9.0;
        double b = -4.7;
        double c = 3.2;

        System.out.println("Valor de a: " + a );
        System.out.println("Valor de b: " + b );
        System.out.println("Valor de c: " + c );

        // 1. Raiz quadrada
        System.out.println("\nRaiz quadrada de a: " + Math.sqrt( a ) );

        // 2. Potência
        System.out.println("\na elevado a c: " + Math.pow( a, c ) );

        // 3. Valor absoluto
        System.out.println("\nValor absoluto de b: " + Math.abs( b ) );

        // 4. Arredondamentos
        System.out.println("\nArredondar c para baixo: " + Math.floor( c ) );
        System.out.println("Arredondar c para cima: "    + Math.ceil( c ) );
        System.out.println("Arredondar c normalmente: "  + Math.round( c ) );

        // 5. Máximo e mínimo entre dois valores
        System.out.println("\nMaior entre a e b: " + Math.max( a , b ) );
        System.out.println("Menor entre a e b: "   + Math.min( a , b ) );

        // 6. Geração de número aleatório entre 0 e 1
        double aleatorio = Math.random();
        System.out.println("\nNúmero aleatório: " + aleatorio );

        // 7. Número aleatório em um intervalo (exemplo: 10 a 50)
        int aleatorioInt = (int)( Math.random() * ( 50 - 10 + 1 ) ) + 10;
        System.out.println("\nNúmero aleatório entre 10 e 50: " + aleatorioInt );

        // 8. Cálculo de ângulos e trigonometria
        double angulo = 45;
        double rad = Math.toRadians(angulo); // converte graus para radianos
        System.out.println("\nSeno de 45°    : " + Math.sin( rad ) );
        System.out.println("Cosseno de 45° : "   + Math.cos( rad ) );
        System.out.println("Tangente de 45°: "   + Math.tan( rad ) );

        // 9. Logaritmo e exponencial
        System.out.println("\nLogaritmo natural de a: " + Math.log(a));
        System.out.println("Exponencial de 2: " + Math.exp(2));

        // 10. Constantes úteis
        System.out.println("\nValor de PI: " + Math.PI);
    }
}
