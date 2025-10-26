package com.mycompany.exemploooprodutosa;

public class Produto {
    String nome;
    double preco;
    int    estoque;

    // Construtor 1 - padrão
    public Produto() {
        this.nome    = "Sem nome";
        this.preco   = 0.0;
        this.estoque = 0;
    }

    // Construtor 2 - com parâmetros
    public Produto(String n , double p , int e ) {
        this.nome    = n;
        this.preco   = p;
        this.estoque = e;
    }

    // Métodos
    public void mostrarDados() {
        System.out.println("\nProduto: " + this.nome + " - Preço: R$ " + this.preco + " - Estoque: " + this.estoque);
    }

    public void aumentarPreco( double valor ) {
        this.preco += valor;
    }

    public void reporEstoque( int qtd ) {
        this.estoque += qtd;
    }

    // Novo método: verificar disponibilidade
    public void verDisponibilidadeEstoque() {
        if (this.estoque > 0) {
            System.out.println("\nProduto disponível em estoque: " + this.estoque + " unidades.");
        } else {
            System.out.println("\nProduto indisponível no momento.");
        }
    }
    // Novo método: vender produto
    public void venderProduto( int qtd ) {
        if (qtd <= this.estoque) {
            this.estoque -= qtd;
            System.out.println("\nVenda realizada com sucesso! Quantidade vendida: " + qtd);
        } else {
            System.out.println("\nEstoque insuficiente para realizar a venda. Estoque atual: " + this.estoque);
        }
    }    
}
