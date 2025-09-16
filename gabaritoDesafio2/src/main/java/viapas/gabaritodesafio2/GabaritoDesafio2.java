/*
    Desenvolvido pelo prof. Viapiana

    Esta é somente uma possibilidade de solução do desafio 2. Há muitas outras.

    16/09/2025
*/

package viapas.gabaritodesafio2;

import java.util.Random;
import java.util.Scanner;

public class GabaritoDesafio2 {

    public static void main(String[] args) {
        
        final int TAMANHO = 100;
        
        Scanner entrada   = new Scanner( System.in );
        Random  aleatorio = new Random();
        
        int codigo , quantidade;
        
        int[] posicoes = new int[ TAMANHO ];
        //int[] estoque  = { 45, 72, 18, 99, 45, 27, 45, 62, 18, 69, 77, 91 };
        
        int[] estoque = new int[ TAMANHO ];
        
        for( int i = 0 ; i < TAMANHO ; i++){
            estoque[ i ] = aleatorio.nextInt( 91 ) + 10;
        }
        
        while( true ){
            quantidade = 0;
            
            System.out.print("\n\nInforme o codigo da peca a ser pesquisado : ");
            codigo = entrada.nextInt();
            
            if( codigo < 10 || codigo > 99 ){
                System.out.println("\n\nCódigo inválido. Encerrando o sistema de controle de estoque.\n");
                break;
            }
            
            for( int i = 0 ; i < TAMANHO ; i++ ){
                if( estoque[ i ] == codigo ){
                   posicoes[ quantidade ] = i;
                   quantidade++;
                }
            }
            
            if( quantidade == 0 ){
                System.out.println("\n\nPeça nao encontrada no estoque.\n");
                continue;
            }
            
            System.out.println("\nQuantidade encontrada : " + quantidade );
            
            System.out.print("Posicoes              : ");
            for( int i = 0 ; i < quantidade ; i++ )
                System.out.print( posicoes[ i ] + ", " );
            
            System.out.println("\b\b");
            
            System.out.println("Primeira ocorrencia   : posicao "   + posicoes[ 0 ] );
            
            System.out.println("Ultima ocorrencia     : posicao "     + posicoes[ quantidade-1 ]);
            
            //System.out.println("Percentual no estoque: " + ( quantidade * 100.0 / TAMANHO ) + "%\n\n" );
            System.out.printf("Percentual no estoque : %.2f%%", ( quantidade * 100.0 / TAMANHO ) );
                
        }
    }
}
