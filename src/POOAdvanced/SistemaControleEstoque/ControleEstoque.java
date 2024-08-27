package POOAdvanced.SistemaControleEstoque;

import java.util.ArrayList;
import java.util.List;

public class ControleEstoque implements Estoque{

    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }
    @Override
    public void removerProduto(String nome) {
        produtos.removeIf(produto -> produto.getNome().equals(nome));
    }
    @Override
    public void exibirEstoqueTotal() {
        for (Produto produto : produtos) {
            produto.exibirInformacoes();
            System.out.println("---------------");
        }
    }
}
