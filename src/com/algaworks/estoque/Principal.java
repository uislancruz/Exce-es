package com.algaworks.estoque;

import java.util.Scanner;

public class Principal {

    static void main(String[] args) {

            Produto produto = new Produto("Apple Watch");
            produto.ativar();
            produto.adicionarEstoque(20);

            comprar(produto);
        }

        private static void comprar(Produto produto) {
            Scanner scanner = new Scanner(System.in);

            do {
                try {
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();

                    efetuarBaixaEstoque(produto, quantidade);
                    System.out.println("Compra realizada");

                    break;

                }catch (IllegalArgumentException e) {
                    System.out.println("Erro ao comprar: " + e.getMessage());
                }catch (ProdutoSemEstoqueException e) {
                    System.out.printf("Erro ao comprar: %s. Estoque disponivel: %d. Estoque solicitado: %d%n",
                            e.getMessage(), e.getEstoqueDisponivel(), e.getEstoqueNecessario());
                }catch (ProdutoInativoException e) {
                    System.out.println("Erro ao comprar: " + e.getMessage());
                    System.out.print("Deseja ativar o produto? ");

                    if(scanner.nextBoolean()) {
                        produto.ativar();
                    }else {
                        System.out.println("Ok. Compra não pode ser realizada.");
                        break;
                    }

                }

            }while (true);
        }

        private static void efetuarBaixaEstoque(Produto produto, int quantidade) {
//            try {
                produto.retirarEstoque(quantidade);
                System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n",
                        quantidade, produto.getQuantidadeEstoque());
//            } catch (IllegalArgumentException e) {
//                System.out.println("Erro ao efetuar compra. " + e.getMessage());
//                throw e;
//            }
        }
}
