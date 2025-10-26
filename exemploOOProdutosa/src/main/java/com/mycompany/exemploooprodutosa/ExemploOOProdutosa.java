package com.mycompany.exemploooprodutosa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploOOProdutosa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Produto prod = null;
        
        int opcao = -1;

        do {
            try {
                System.out.println("\n=== MENU ===");
                System.out.println("1 - Criar produto (vazio)");
                System.out.println("2 - Criar produto com dados");
                System.out.println("3 - Aumentar preço");
                System.out.println("4 - Mostrar produto");
                System.out.println("5 - Repor estoque");
                System.out.println("6 - Ver disponibilidade de estoque");
                System.out.println("7 - Vender produto");
                System.out.println("0 - Sair");
                System.out.print("\nOpção: ");

                opcao = entrada.nextInt();
                
                entrada.nextLine(); // limpar o buffer

                switch (opcao) {
                    case 1 -> {
                        prod = new Produto();
                        System.out.println("\nProduto criado com construtor padrão.\n");
                    }
                    
                    case 2 -> {
                        System.out.print("\nNome    : ");
                        String nome = entrada.nextLine();
                        
                        System.out.print("Preço   : ");
                        double preco = entrada.nextDouble();
                        
                        System.out.print("Estoque : ");
                        int estoque = entrada.nextInt();
                        entrada.nextLine();
                        
                        prod = new Produto( nome  , preco , estoque );
                        
                        System.out.println("\nProduto criado com sucesso!\n");
                    }
                    
                    case 3 -> {
                        if (prod != null) {
                            System.out.print("\nValor a aumentar: ");
                            double valor = entrada.nextDouble();
                            entrada.nextLine();
                            
                            prod.aumentarPreco(valor);
                            
                            System.out.println("\nPreço atualizado!\n");
                        } else {
                            System.out.println("\n*** Erro : Crie um produto primeiro!\n");
                        }
                    }
                    
                    case 4 -> {
                        if (prod != null) {
                            prod.mostrarDados();
                        } else {
                            System.out.println("\n*** Erro : Nenhum produto criado ainda!\n");
                        }
                    }
                    
                    case 5 -> {
                        if (prod != null) {
                            System.out.print("\nQuantidade a repor: ");
                            int qtd = entrada.nextInt();
                            entrada.nextLine();
                            
                            prod.reporEstoque(qtd);
                            System.out.println("\nEstoque atualizado!\n");
                        } else {
                            System.out.println("\n*** Erro : Crie um produto primeiro!\n");
                        }
                    }
                    
                    case 6 -> {
                        if (prod != null) {
                            prod.verDisponibilidadeEstoque();
                        } else {
                            System.out.println("\n*** Erro : Crie um produto primeiro!\n");
                        }
                    }

                    case 7 -> {
                        if (prod != null) {
                            System.out.print("\nQuantidade a vender: ");
                            int qtd = entrada.nextInt();
                            entrada.nextLine();

                            prod.venderProduto(qtd);
                        } else {
                            System.out.println("\n*** Erro : Crie um produto primeiro!\n");
                        }
                    }

                    case 0 -> System.out.println("\nEncerrando o programa...\n");
                    
                    default -> System.out.println("\nOpção inválida!\n");
                }

            } catch (InputMismatchException e) {
                System.out.println("\nEntrada inválida! Digite apenas números quando solicitado.");
                entrada.nextLine(); // limpar entrada errada
            } catch (Exception e) {
                System.out.println("\nOcorreu um erro inesperado: " + e.getMessage());
            }

        } while (opcao != 0);

        entrada.close(); 
        
    }
}
