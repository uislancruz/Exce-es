package com.algaworks;

import com.algaworks.crm.Cliente;
import com.algaworks.crm.ServicoCadastroCliente;

public class PrincipalCliente {
    static void main(String[] args) {
        ServicoCadastroCliente servicoCadastroCliente = new ServicoCadastroCliente();
        Cliente clienteCadastrado = servicoCadastroCliente.cadastrar("João", 15);

        System.out.printf("Cliente cadastrado: %s%n", clienteCadastrado.getNome() + " idade: " + clienteCadastrado.getIdade());
    }
}
