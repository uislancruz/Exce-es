package com.algaworks.desafioexcecoes;

public class Principal1 {
    static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("123");

        conta1.depositar(1_000);

        System.out.printf("Saldo atual da conta 1: R$ %.2f%n", conta1.getSaldo());
    }
}
