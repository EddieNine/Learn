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

    public void atualizarProduto(String nome, String novoNome, double novoPreco, int novaQuantidade) {
        for(Produto produto : produtos) {
            if(produto.getNome().equals(nome)) {
                produto.setNome(novoNome);
                produto.setPreco(novoPreco);
                produto.setQuantidadeEmEstoque(novaQuantidade);
                System.out.println("Produto atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }
}
