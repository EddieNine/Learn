package cursoBackend.Semana2.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        String continuar;


        do {
            System.out.print("Digite o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o preço do produto: ");
            double preco = scanner.nextDouble();
            scanner.nextLine();

            produtos.add(new Produto(nome, preco));

            System.out.println("Deseja adicionar outro produto? (s/n): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\nDigite um valor mínimo para filtrar os produtos: ");
        double valorMinimo = scanner.nextDouble();

        double total = 0;

        System.out.println("\nProdutos com preço maior ou igual a R$" + valorMinimo + ":");
        for(Produto produto : produtos) {
            total += produto.getPreco();

            if(produto.getPreco() >= valorMinimo) {
                System.out.printf("- %s: R$ %.2f\n", produto.getNome(), produto.getPreco());
            }
        }

        System.out.printf("\n💰 Valor total da compra: R$ %.2f\n", total);

        scanner.close();
    }
}
