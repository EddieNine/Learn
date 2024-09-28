package DesafiosExtras.SistemaControleEstoque;

import java.util.Scanner;

public class SistemaPrincipal {
    public static void main(String[] args) {
        SistemaEstoque sistema = new SistemaEstoque();
        Scanner scanner = new Scanner(System.in);

        Produto p1 = new Produto("Camisa", 50.0, 100);
        Produto p2 = new Produto("Tênis", 200.0, 50);

        sistema.adicionarProduto("Camisa", p1);
        sistema.adicionarProduto("Tênis", p2);

        try {
            sistema.atualizarEstoque("Camisa", -120);
        } catch (EstoqueInsuficienteException | ProdutoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        sistema.exibirProdutos();
    }
}
