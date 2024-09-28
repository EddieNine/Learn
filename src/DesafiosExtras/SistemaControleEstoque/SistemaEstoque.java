package DesafiosExtras.SistemaControleEstoque;

import java.util.HashMap;

public class SistemaEstoque {
    private HashMap<String, Produto> estoque;

    public SistemaEstoque() {
        estoque = new HashMap<>();
    }

    public void adicionarProduto(String nome, Produto produto) {
        estoque.put(nome, produto);
        System.out.println("Produto " + nome + " adicionado ao estoque.");
    }

    public void removerProduto(String nome) throws ProdutoNaoEncontradoException {
        if (!estoque.containsKey(nome)) {
            throw new ProdutoNaoEncontradoException("Produto " + nome + " não encontrado no estoque.");
        }
        estoque.remove(nome);
        System.out.println("Produto " + nome + " removido do estoque.");
    }

    public void atualizarEstoque(String nome, int quantidade) throws ProdutoNaoEncontradoException, EstoqueInsuficienteException {
        Produto produto = estoque.get(nome);
        if (produto == null) {
            throw new ProdutoNaoEncontradoException("Produto " + nome + " não encontrado no estoque");
        }
        if (quantidade < 0) {
            produto.removerEstoque(-quantidade);
        } else {
            produto.adicionarEstoque(quantidade);
        }
        System.out.println("Estoque do produto " + nome + " atualizado.");
    }

    public void exibirProdutos() {
        if (estoque.isEmpty()) {
            System.out.println("Nenhum produto no estoque.");
        } else {
            for (Produto produto : estoque.values()) {
                produto.exibirInfo();
            }
        }
    }

}
