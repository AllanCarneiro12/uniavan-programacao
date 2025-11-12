
package com.mycompany.exemploarquivotexto;

import java.io.*;
import java.util.Scanner;

public class ExemploArquivoTexto {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in );
        String nomeArquivo;
        String novoNomeArquivo;
        int deslocamento, funcao;
        int codigoCaractere;

        try {
            System.out.print("\nDigite o nome do arquivo texto (ex: texto.txt): ");
            nomeArquivo = entrada.nextLine();

            while( true ){
                System.out.print("\nDigite o número de deslocamento (ex: 1 a 25): ");
                deslocamento = entrada.nextInt();
                if( deslocamento <=0 || deslocamento >25 ){
                    System.out.println("\nValor invalido. Redigite...\n");
                }
                else
                    break;
            }
            
            System.out.println("\nDigite 0 para embaralhar ou 1 para desembaralhar: ");
            funcao = entrada.nextInt();

            // Abre o arquivo para leitura
            FileReader arqLeitura = new FileReader( nomeArquivo );
            BufferedReader bufferArqLeitura = new BufferedReader( arqLeitura );

            if( funcao == 0 ){
               // Cria o novo arquivo com "_embaralhado" no nome
               novoNomeArquivo = nomeArquivo.replace( ".txt" , "_embaralhado.txt" );
            } else {
               novoNomeArquivo = nomeArquivo.replace( ".txt" , "_desembaralhado.txt" );
               deslocamento *= -1;
                
            }
            
            FileWriter arqGravacao = new FileWriter( novoNomeArquivo );
            BufferedWriter bufferarqGravacao = new BufferedWriter( arqGravacao );
            
            while (  ( codigoCaractere = bufferArqLeitura.read() ) != -1 ) {
                char letra = (char) codigoCaractere;

                // Somente desloca letras (a-z e A-Z)
                if ( Character.isLetter( letra ) ) {
                    
                   if (Character.isUpperCase(letra)) {
                        letra = (char) ('A' + ( (letra - 'A' + deslocamento + 26) % 26 ));  
                    } else if (Character.isLowerCase(letra)) {
                        letra = (char) ('a' + ( (letra - 'a' + deslocamento + 26) % 26 ));
                    }
                   
                }

                bufferarqGravacao.write(letra);
            }

            bufferArqLeitura.close();
            bufferarqGravacao.close();

            if ( funcao == 0 )
                System.out.println("\n\nArquivo embaralhado salvo como: " + novoNomeArquivo);
            else
                System.out.println("\n\nArquivo desembaralhado salvo como: " + novoNomeArquivo);
                

        } catch (FileNotFoundException erro) {
            System.out.println("\nArquivo não encontrado!");
        } catch (IOException erro) {
            System.out.println("\nErro ao ler ou gravar o arquivo!");
        } finally {
            entrada.close();
        }
    }
}
