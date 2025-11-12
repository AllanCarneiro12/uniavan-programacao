
package com.mycompany.exemploooprodutosarquivo;


import java.io.Serializable;

public class Produto implements Serializable {
    
    private static final long serialVersionUID = 1L; // 1L : primeira versao da classe. caso mudar atributos, criar outra versao
    
    private int    codigo;
    private String nome;
    private double preco;
    private int    estoque;

    // Construtor - com parâmetros
    // usaremos chamada a outros metodos para poder fazer a consitencia dos dados
    public Produto( int c , String n , double p , int e ) {
        setCodigo( c );
        setNome( n );
        setPreco( p );
        setEstoque( e );
    }

    // Métodos
    
    // gets e sets
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo( int codigo ) {
        if ( codigo < 0 ) {
            throw new IllegalArgumentException("Código não pode ser negativo\n");
        }
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome( String nome ) {
        if ( nome == null || nome.trim().isEmpty() ) {
            throw new IllegalArgumentException("Nome não pode ser vazio\n");
        }
        this.nome = nome.trim();
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco( double preco ) {
        if ( preco <= 0.0 ) {
            throw new IllegalArgumentException("Preço deve ser maior que zero\n");
        }
        this.preco = preco;
    }

    public int getEstoque() {
        return this.estoque;
    }

    public void setEstoque( int estoque ) {
        if ( estoque < 0 ) {
            throw new IllegalArgumentException("Estoque não pode ser negativo\n");
        }
        this.estoque = estoque;
    }

    // ==================== MÉTODOS DE REGRAS DE NEGÓCIO ====================

    public void aumentarPreco( double valor ) {
        if ( valor <= 0 ) {
            throw new IllegalArgumentException("O aumento deve ser maior que zero\n");
        }
        this.preco += valor;
    }

    public void reporEstoque( int qtd ) {
        if ( qtd <= 0 ) {
            throw new IllegalArgumentException("A quantidade para repor deve ser maior que zero\n");
        }
        this.estoque += qtd;
    }

    public void retirarEstoque( int qtd ) {
        if ( qtd <= 0 ) {
            throw new IllegalArgumentException("A quantidade para retirar deve ser maior que zero\n");
        }
        if ( qtd > this.estoque ) {
            throw new IllegalArgumentException("Quantidade solicitada maior que o estoque disponível\n");
        }
        this.estoque -= qtd;
    }

    public boolean verDisponibilidadeEstoque() {
        return this.estoque > 0;
    }

    public String getStatusEstoque() {
        return verDisponibilidadeEstoque()
                ? "\nDisponível: " + this.estoque + " unidades."
                : "Indisponível no momento\n";
    }
     
    public String mostraDados() {
        return "\n\nCódigo  : " + codigo +
               "\nProduto : " + nome +
               "\nPreço   : R$ " + String.format("%.2f", preco) +
               "\nEstoque : " + estoque + "\n";

    }
    
    //@Override
    //public String toString() {
    //    return "Produto: " + nome + " | Preço: R$ " + preco;
    //}
        
}