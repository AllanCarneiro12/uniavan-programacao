package carneiro.allanpedroisac;

import java.util.Scanner;

public class AllanPedroIsac {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int[][] cadeiras = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2},
            {2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2},
            {2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2},
            {2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2},
            {2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2},
            {2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2},
            {2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2},
            {2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2},
            {2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2},
            {2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2},
            {2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2},
            {2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2}
        }; // 0=livre, 1=ocupado, 2=indisponivel

        //define todas as cadeiras como livres "0"
        /*for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 20; j++) {
                cadeiras[i][j] = 0;
            }
        }*/
        // for (int i = 0; i < 30; i++) {
        //     for(int j = 0; j < 20; j++) {
        //         if (j + 16 <= i){
        //             cadeiras[i][j] = 2;
        //         }
        //     }
        // }
        // for (int i = 0; i < 30; i++) {
        //     for(int j = 0; j < 20; j++) {
        //         if (j + i>= 35 ){
        //             cadeiras[i][j] = 2;
        //         }
        //     }
        // }
        //imprime as cadeiras disponiveis na tela para testes
        /*for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.printf("[%d]", cadeiras[i][j]);
            }
            System.out.println();
        }*/

        int fileira;
        int cadeira;
        int cadeirasVendidas = 0;

        //loop para venda das cadeiras
        do {
            System.out.println("Insira o assento:");
            System.out.print("fileira(0-29): ");
            fileira = kb.nextInt();
            System.out.print("cadeira(0-19): ");
            cadeira = kb.nextInt();

            if (cadeira >= 0 && fileira >= 0) {
                //verifica se a cadeira está ocupada
                if (cadeiras[fileira][cadeira] == 0) {
                    System.out.println("Cadeira registrada com sucesso!");
                    cadeiras[fileira][cadeira] = 1;
                    cadeirasVendidas++;
                } else {
                    System.out.println("Cadeira nao disponivel");
                }
            }
            System.out.println("---------------------------------------");
        } while (fileira >= 0 && cadeira >= 0);

        //relatorio
        System.out.println("Programa finalizado.");
                
        System.out.println("Cadeiras vendidas: " + cadeirasVendidas);
        for (int i = 0; i < 30; i++) {
            int vendasFileira = 0;
            for (int j = 0; j < 20; j++) {
                if (cadeiras[i][j] == 1) {
                    vendasFileira++;
                }
            }
            if (vendasFileira != 0) {
                System.out.println("Vendas na fileira [" + i + "]: " + vendasFileira);
            }
        }
    }
}
