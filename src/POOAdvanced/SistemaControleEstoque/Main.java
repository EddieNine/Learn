package POOAdvanced.SistemaControleEstoque;

public class Main {
    public static void main(String[] args) {
        ControleEstoque controleEstoque = new ControleEstoque();

        ProdutoPerecivel leite = new ProdutoPerecivel("Leite", 3.50, 20, "01/09/2024");
        ProdutoNaoPerecivel arroz = new ProdutoNaoPerecivel("Arroz", 4.50, 50, "Alimentos");

        controleEstoque.adicionarProduto(leite);
        controleEstoque.adicionarProduto(arroz);

        controleEstoque.exibirEstoqueTotal();

        controleEstoque.removerProduto("Leite");
        controleEstoque.exibirEstoqueTotal();
    }
}
