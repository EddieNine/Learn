package POOAdvanced.SistemaControleEstoque;

public class ProdutoNaoPerecivel extends Produto{
    private String categoria;

    public ProdutoNaoPerecivel(String nome, double preco, int quantidadeEmEstoque, String categoria){
        super(nome, preco, quantidadeEmEstoque);
        this.categoria = categoria;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Categoria: " + categoria);
    }
}
