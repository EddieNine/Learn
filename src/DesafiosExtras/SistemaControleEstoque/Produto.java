package DesafiosExtras.SistemaControleEstoque;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade) throws EstoqueInsuficienteException{
        if (this.quantidade < quantidade) {
            throw new EstoqueInsuficienteException("Estoque insuficiente para remover essa quantidade");
        }
        this.quantidade -= quantidade;
    }

    public void exibirInfo(){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }
}
