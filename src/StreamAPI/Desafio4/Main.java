package StreamAPI.Desafio4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Notebook", 3500.0, "Eletrônicos", 10),
                new Produto("Mouse", 50.0, "Eletrônicos", 100),
                new Produto("Teclado", 150.0, "Eletrônicos", 50),
                new Produto("Livro de Java", 60.0, "Livros", 30),
                new Produto("Livro de Python", 75.0, "Livros", 20),
                new Produto("Maçã", 5.0, "Alimentos", 200),
                new Produto("Banana", 3.0, "Alimentos", 180),
                new Produto("Fone de Ouvido", 200.0, "Eletrônicos", 15)
        );

        // 1. Filtrar produtos com preço maior que 100
        List<Produto> produtosCaros = produtos.stream()
                .filter(produto -> produto.getPreco() > 100)
                .toList();

        System.out.println("Produtos com preço maior que 100:");
        produtosCaros.forEach(System.out::println);

        // 2. Agrupar produtos por categoria
        Map<String, List<Produto>> produtosPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria));

        System.out.println("\nProdutos agrupados por categoria:");
        produtosPorCategoria.forEach((categoria, listaProdutos) -> {
            System.out.println(categoria + ": " + listaProdutos);
        });

        // 3. Calcular o valor total do estoque por categoria
        Map<String, Double> valorTotalEstoquePorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(
                        Produto::getCategoria,
                        Collectors.summingDouble(produto -> produto.getPreco() * produto.getQuantidade())
                ));

        System.out.println("\nValor total do estoque por categoria:");
        valorTotalEstoquePorCategoria.forEach((categoria, valorTotal) -> {
            System.out.println(categoria + ": " +valorTotal);
        });

        // 4. Ordenar produtos da categoria "Eletrônicos" por preço
        List<Produto> eletronicosOrdenadosPorPreco = produtos.stream()
                .filter(produto -> produto.getCategoria().equals("Eletrônicos"))
                .sorted(Comparator.comparing(Produto::getPreco))
                .toList();

        System.out.println("\nProdutos da categoria 'Eletrônicos' ordenados por preço:");
        eletronicosOrdenadosPorPreco.forEach(System.out::println);

        // 5. Obter apenas os nomes dos produtos da categoria "Livros"
        List<String> nomesLivros = produtos.stream()
                .filter(produto -> produto.getCategoria().equals("Livros"))
                .map(Produto::getNome)
                .toList();

        System.out.println("\nNomes dos produtos da categoria 'Livros':");
        nomesLivros.forEach(System.out::println);
    }
}
