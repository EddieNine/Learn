package POOAdvanced.SistemaControleEstoque;

interface Estoque {
    void adicionarProduto(Produto produto);
    void removerProduto(String nome);
    void exibirEstoqueTotal();
}
