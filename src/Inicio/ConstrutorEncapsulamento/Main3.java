package Inicio.ConstrutorEncapsulamento;

public class Main3 {
    public static void main(String[] args) {
        Produto produto = new Produto("Caderno", -5.0);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$" + produto.getPreco());
    }
}
