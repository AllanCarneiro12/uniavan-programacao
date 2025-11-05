package viapas.exemploooprodutosv2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploOOProdutosV2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        final int TAMANHO = 5;
        
        Produto[] cadastro = new Produto[TAMANHO];
        
        Produto prod = null;
        
        int opcao, indice;

        do {
            System.out.println("\n=== MENU ===");
            //System.out.println("1 - Criar produto (vazio)");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Excluir produto");
            System.out.println("3 - Aumentar preço");
            System.out.println("4 - Mostrar produtos");
            System.out.println("5 - Repor estoque");
            System.out.println("6 - Retirar do estoque");
            System.out.println("7 - Ver disponibilidade de estoque");
            System.out.println("0 - Sair");
            System.out.print("\nOpção: ");

            opcao = lerInt(entrada);

            try {
                switch (opcao) {
                    /*case 1 -> {
                        prod = new Produto();
                        System.out.println("\nProduto criado com construtor padrão.\n");
                    }*/
                    
                    case 1 -> {
                        //adicionar um novo produto no vetor cadastro

                        for (indice = 0; indice < TAMANHO; indice++){
                            if (cadastro[indice] == null) break;
                        }
                        if(indice == TAMANHO){
                            System.out.println("\nVetor Cheio. nao pode incluir\n");
                            continue;
                        }
                        
                        System.out.println("\nO produto ssera incluindo no indice: "+indice);
                        
                        System.out.print("\nCódigo   : ");
                        int codigo = entrada.nextInt();
                        entrada.nextLine(); // limpa buffer
                        //int codigo = lerIntPositivo( entrada );
                        
                        if (buscarCodigo(cadastro, codigo , TAMANHO) != -1){
                            System.out.println("Codigo já existe");
                            continue;
                        }
                    
                        System.out.print("Nome     : ");
                        String nome = entrada.nextLine();

                        System.out.print("Preço    : ");
                        double preco = entrada.nextDouble();                        
                        //double preco = lerDoublePositivo( entrada );

                        System.out.print("Estoque  : ");
                        int estoque = entrada.nextInt();
                        //int estoque = lerIntNaoNegativo( entrada );

                        prod = new Produto( codigo , nome , preco , estoque );
                        
                        cadastro[indice] = prod;
                        
                        System.out.println("\nProduto criado com sucesso!\n");
                    }
                    
                    case 2 -> {
                        System.out.println("Excluir Produto");
                        System.out.print("\nCódigo   : ");
                        int codigo = entrada.nextInt();
                        entrada.nextLine(); // limpa buffer
                        
                        indice = buscarCodigo (cadastro, codigo, TAMANHO);
                        
                        if(indice == -1){
                            System.out.println("codigo não encontrado");
                            continue;
                        }
                        
                        cadastro[indice] = null;
                        
                        System.out.println("Produto excluido");
                        
                    }
                    
                    case 3 -> {
                        System.out.println("Aumento de preço");
                        System.out.print("\nCódigo   : ");
                        int codigo = entrada.nextInt();
                        entrada.nextLine(); // limpa buffer
                        
                        indice = buscarCodigo (cadastro, codigo, TAMANHO);
                        
                        if(indice == -1){
                            System.out.println("codigo não encontrado");
                            continue;
                        }
                        
                        System.out.print("\nValor a aumentar : ");
                        double valor = lerDoublePositivo(entrada);
                        
                        cadastro[indice].aumentarPreco(valor);
                                             
                    }
                    
                    case 4 -> {
                        /*if ( existe( prod ) ) {
                            System.out.println( prod.mostraDados() );
                        }*/
                        
                        for (int i = 0; i< TAMANHO; i++){
                            if (cadastro[i] != null){
                                System.out.println(cadastro[i].mostraDados());
                            }
                        }
                    }
                    
                    case 5 -> {
                        System.out.println("repor estoque");
                        System.out.print("\nCódigo   : ");
                        int codigo = entrada.nextInt();
                        entrada.nextLine(); // limpa buffer
                        
                        indice = buscarCodigo (cadastro, codigo, TAMANHO);
                        
                        if(indice == -1){
                            System.out.println("codigo não encontrado");
                            continue;
                        }
                        
                        System.out.print("\nQuantidade da reposição: ");
                        int valor = lerIntPositivo(entrada);
                        
                        cadastro[indice].reporEstoque(valor);
                        
                        /*if ( existe( prod ) ) {
                            System.out.print("\nQuantidade a repor : ");
                            int qtd = lerIntPositivo( entrada );
                            prod.reporEstoque( qtd );
                            System.out.println("\nEstoque atualizado!\n");
                        }*/
                    }
                    
                    case 6 -> {
                        System.out.println("repor estoque");
                        System.out.print("\nCódigo   : ");
                        int codigo = entrada.nextInt();
                        entrada.nextLine(); // limpa buffer
                        
                        indice = buscarCodigo (cadastro, codigo, TAMANHO);
                        
                        if(indice == -1){
                            System.out.println("codigo não encontrado");
                            continue;
                        }
                        
                        System.out.print("\nQuantidade da reposição: ");
                        int valor = lerIntPositivo(entrada);
                        
                        cadastro[indice].retirarEstoque(valor);
                        
                        /*if ( existe( prod ) ) {
                            System.out.print("\nQuantidade a retirar : ");
                            int qtd = lerIntPositivo( entrada );
                            prod.retirarEstoque( qtd );
                            System.out.println("\nEstoque atualizado!\n");
                        }*/
                    }
                    
                    case 7 -> {
                        System.out.println("verificar estoque");
                        System.out.print("\nCódigo   : ");
                        int codigo = entrada.nextInt();
                        entrada.nextLine(); // limpa buffer
                        
                        indice = buscarCodigo (cadastro, codigo, TAMANHO);
                        
                        if(indice == -1){
                            System.out.println("codigo não encontrado");
                            continue;
                        }
                        System.out.println("Estoque do produto: "+cadastro[indice].getEstoque());
                        /*if ( existe( prod )) {
                            System.out.println("\n" + prod.getStatusEstoque());
                        }*/
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
    
    /*private static int buscaIndiceLivre(produto[],int tamanho ) {
        // percorrer o vetor para achar o primeiro indice livre
        for(int i = 0; i < tamanho; i++) {
            if ()
        }
    }*/
    
    private static int buscarCodigo(Produto[] cad,int cod, int TAMANHO){
        int flag = 0;
        int indice = 0;
        for(indice = 0; indice < TAMANHO; indice++) {
            if (cad[indice] != null && cad[indice].getCodigo() == cod) {
                flag = 1;
                break;
            }
        }
        if (flag == 0 ) return -1;
        else return indice;
    }

    private static boolean existe( Produto p ) {
        if ( p == null ) {
            System.out.println("\n\n*** Erro : Crie um produto primeiro!\n");
            return false;
        }
        return true;
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