package com.algaworks.cadastro;

public class PrincipalCadastro {
    static void main(String[] args) {
        ServicoCadastroAnuncio servicoCadastroAnuncio = new ServicoCadastroAnuncio();
        servicoCadastroAnuncio.cadastrar("999", "Teste");

        System.out.println("Cadastro realizado");
    }
}
