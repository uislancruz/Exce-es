package com.algaworks.crm;

public class ServicoCadastroCliente {

    public Cliente cadastrar(String nome, int idade){
        if (idade < 18){
            throw new RuntimeException("Cliente menor de idade não pode ser cadastrado: " + nome +": "+ idade + " Anos");
        }

        //TODO faz o cadastro aqui

        return new Cliente(nome, idade);
    }
}
