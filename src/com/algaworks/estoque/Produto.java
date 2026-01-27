package com.algaworks.estoque;

public class Produto {

    private String nome;
    private int quantidadeEstoque;
    private boolean ativo;

    public Produto(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void ativar(){
        this.ativo = true;
    }
    public void desativar(){
        this.ativo = false;
    }

    public void retirarEstoque(int quantidade){
        this.quantidadeEstoque -= quantidade ;
    }

    public void adicionarEstoque(int quantidade){
        this.quantidadeEstoque += quantidade;
    }
}
