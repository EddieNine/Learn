package POOAdvanced.SistemaControleEstoque;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidadeEmEstoque, String dataValidade){
        super(nome, preco, quantidadeEmEstoque);
        this.dataValidade = dataValidade;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Data de Validade: " + dataValidade);
    }
}
