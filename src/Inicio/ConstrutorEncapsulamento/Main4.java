package Inicio.ConstrutorEncapsulamento;

public class Main4 {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[3];
        
        produtos[0] = new Produto("Caderno", 15.0);
        produtos[1] = new Produto("Caneta", 3.5);
        produtos[2] = new Produto("Borracha", -2.0); // Teste com valor negativo

        System.out.println("\nLista de Produtos:");
        for (Produto p : produtos) {
            System.out.println("Produto: " + p.getNome() + " - R$" + p.getPreco());
        }
    }
}
