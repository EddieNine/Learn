package POOAdvanced.SistemaControleEstoque;

import java.util.ArrayList;
import java.util.Comparator;
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

    public void ordernarPorNome(){
        produtos.sort(Comparator.comparing(Produto::getNome));
        System.out.println("Produtos ordenados por nome!");
    }

    public void ordenarPorPreco() {
        produtos.sort(Comparator.comparing(Produto::getPreco));
        System.out.println("Produtos ordenados por preço!");
    }

    public void exibirProdutos() {
        for (Produto produto: produtos) {
            System.out.println(produto.getNome() + " - " + produto.getPreco());
        }
    }
}
