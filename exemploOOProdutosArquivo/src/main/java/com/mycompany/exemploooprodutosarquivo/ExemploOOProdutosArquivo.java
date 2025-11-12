package com.mycompany.exemploooprodutosarquivo;

import java.util.InputMismatchException;
import java.util.Scanner;

import java.io.*;
import java.util.Arrays;

public class ExemploOOProdutosArquivo {

    // definição de constantes 
    private static final int    TAMANHO = 5;
    private static final String ARQUIVO = "CADASTRO.DAT";

    public static void main(String[] args) {

         
        Scanner entrada = new Scanner(System.in);
        
        // criar o vetor que armazenara os produtos, que por sua vez sao objetos
        Produto[] cadastro = new Produto[ TAMANHO ];
        
        int opcao , indice;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Excluir produto");
            System.out.println("3 - Mostrar produtos");
            System.out.println("4 - Aumentar preço");
            System.out.println("5 - Repor estoque");
            System.out.println("6 - Retirar do estoque");
            System.out.println("7 - Gravar em arquivo");
            System.out.println("8 - Ler do arquivo");
            System.out.println("0 - Sair");
            System.out.print("\nOpção: ");

            opcao = lerInt( entrada );

            try {
                switch (opcao) {
                    
                    case 1 -> {
                        // adicionar um novo produto no vetor cadastr              
                        // busca o primeiro indice disponivel no vetor
                        for( indice = 0 ; indice < TAMANHO ; indice++ ){
                            if( cadastro[ indice ] == null ) break;
                        }
                        
                        if( indice == TAMANHO ){
                            System.out.println("\nVetor cheio. Nao pode incluir\n");
                            continue;
                        }
                            
                        System.out.println("\nO produto sera incluido no indice " + indice + "\n");    
                            
                        System.out.print("\nCódigo   : ");
                        int codigo = lerIntNaoNegativo( entrada );
                        
                        // verificar se aquele codigo ja nao existe no vetor                        
                        
                        if( buscarCodigo( cadastro , codigo ) != -1 ){
                            System.out.println("\nCodigo ja existente. Nao pode incluir\n");
                            continue;    
                        }
                        
                        System.out.print("Nome     : ");
                        String nome = entrada.nextLine();

                        System.out.print("Preço    : ");
                        double preco = lerDoublePositivo( entrada );

                        System.out.print("Estoque  : ");
                        int estoque = lerIntNaoNegativo( entrada );

                        Produto prod = new Produto( codigo , nome , preco , estoque );
                        
                        cadastro[ indice ] = prod;
                        
                        System.out.println("\nProduto criado com sucesso!\n");
                        
                        
                        System.out.println( prod );
                    }
                    
                    case 2 -> {
                        System.out.println("\nExcluir o produto\n");
                        System.out.print("\nCódigo   : ");
                        int codigo = lerIntNaoNegativo( entrada );
                        //entrada.nextLine(); // limpa buffer
                        
                        indice = buscarCodigo( cadastro , codigo );
                        
                         if( indice == -1 ){
                            System.out.println("\nCodigo nao encontrado\n");
                            continue;
                        }
                        
                         cadastro[ indice ] =null;
                         
                         System.out.println("\nProduto excluido\n");
                    }
                    
                    case 3 -> {
                        for( int i = 0 ; i < TAMANHO ; i++ ){
                            if( cadastro[ i ] != null ){
                                System.out.print( cadastro[ i ].mostraDados() );
                            }
                        }
                    }

                    case 4 -> {
                        System.out.println("\nAumento de preco\n");
                        System.out.print("\nCódigo   : ");
                        int codigo = lerIntNaoNegativo( entrada );
                        //entrada.nextLine(); // limpa buffer
                        
                        indice = buscarCodigo( cadastro , codigo );
                        
                        if( indice == -1 ){
                            System.out.println("\nCodigo nao encontrado\n");
                            continue;
                        }
                        
                        System.out.print("\nValor a aumentar : ");
                        double valor = lerDoublePositivo( entrada );
                        
                        cadastro[ indice ].aumentarPreco( valor );
                        
                         System.out.println("\nPreço atualizado!\n");
                    }
                    
                    
                    case 5 -> {
                        System.out.println("\nReposicao de estoque\n");
                        System.out.print("\nCódigo   : ");
                        int codigo = lerIntNaoNegativo( entrada );
                        //entrada.nextLine(); // limpa buffer
                        
                        indice = buscarCodigo( cadastro , codigo );
                        
                        if( indice == -1 ){
                            System.out.println("\nCodigo nao encontrado\n");
                            continue;
                        }
                        
                        System.out.print("\nQuantidade a repor : ");
                        int qtd = lerIntPositivo( entrada );
                        
                        cadastro[ indice ].reporEstoque( qtd );
                        
                        System.out.println("\nEstoque atualizado!\n");
                    }
                    
                    case 6 -> {
                        System.out.println("\nRetirar do estoque\n");
                        System.out.print("\nCódigo   : ");
                        int codigo = lerIntNaoNegativo( entrada );
                        //entrada.nextLine(); // limpa buffer
                        
                        indice = buscarCodigo( cadastro , codigo );
                        
                        if( indice == -1 ){
                            System.out.println("\nCodigo nao encontrado\n");
                            continue;
                        }
                        
                        System.out.print("\nQuantidade a retirar : ");
                        int qtd = lerIntPositivo( entrada );
                        
                        cadastro[ indice ].retirarEstoque( qtd );
                        
                        System.out.println("\nEstoque atualizado!\n");
                    }
                    
                    case 7 -> {
                        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream( ARQUIVO ))) {
                            out.writeObject( cadastro );
                            System.out.println("\nVetor de produtos salvo com sucesso!\n");
                        } catch (IOException e) {
                            System.out.println("\nFalha ao acessar o arquivo. Verifique o nome, o caminho e as permissões.\n");
                            e.printStackTrace(); // use apenas durante o desenvolvimento
                        }
                    }
                    
                    case 8-> {
                        
                        Arrays.fill( cadastro , null);
                        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream( ARQUIVO ))) {
                            cadastro = ( Produto[] ) in.readObject();
                            System.out.println("\nVetor de produtos lido com sucesso!\n");
                        } catch (IOException | ClassNotFoundException e) {
                            System.out.println("\nFalha ao acessar o arquivo. Verifique o nome, o caminho e as permissões.\n");
                            e.printStackTrace(); // use apenas durante o desenvolvimento
                        }
                    }
                    
                    case 0 -> System.out.println("\nEncerrando o programa...\n");
                    
                    default -> System.out.println("\nOpção inválida!\n");
                }

            } catch ( IllegalArgumentException erro ) {
                System.out.println("\n*** Erro : " + erro.getMessage() );
            } catch ( Exception erro ) {
                System.out.println("\nOcorreu um erro inesperado : " + erro.getMessage() );
            }

        } while (opcao != 0);

        entrada.close();
    }

    // ==================== FUNÇÕES AUXILIARES ====================
    
    private static int buscarCodigo( Produto[] cad , int cod ){
        int flag = 0 , indice;
        for( indice = 0 ; indice < cad.length ; indice ++ ){
            if( cad[ indice ] != null && cad[ indice ].getCodigo() == cod ){
                flag = 1;
                break;
            }
        }
        if ( flag == 0 )
            return -1;
        else 
            return indice;
    }
    
    private static int lerInt( Scanner entrada ) {
        while (true) {
            try {
                int valor = entrada.nextInt();
                entrada.nextLine(); // limpa buffer
                return valor;
            } catch (InputMismatchException e) {
                System.out.print("\nDigite um número inteiro : ");
                entrada.nextLine();
            }
        }
    }

    private static int lerIntPositivo( Scanner entrada ) {
        int valor;
        do {
            valor = lerInt( entrada );
            if ( valor <= 0 ) System.out.print("\nValor deve ser > 0 : ");
        } while ( valor <= 0 );
        return valor;
    }

    private static int lerIntNaoNegativo( Scanner entrada ) {
        int valor;
        do {
            valor = lerInt( entrada );
            if (valor < 0) System.out.print("\nValor deve ser >= 0 : ");
        } while (valor < 0);
        return valor;
    }

    private static double lerDoublePositivo( Scanner entrada ) {
        while (true) {
            try {
                double valor = entrada.nextDouble();
                entrada.nextLine();
                if (valor > 0) return valor;
                System.out.print("\nValor deve ser > 0: ");
            } catch (InputMismatchException e) {
                System.out.print("\nDigite um número válido (ex: 10.5) : ");
                entrada.nextLine();
            }
        }   
    
    }
}