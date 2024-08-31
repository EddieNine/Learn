package ImplementacaoOrdenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Notebook", 3500.00, 5));
        produtos.add(new Produto("Smartphone", 2000.00, 10));
        produtos.add(new Produto("Tablet", 1500.00, 8));

        // Ordenando por nome
        Collections.sort(produtos);
        System.out.println("Ordenação por Nome.");
        produtos.forEach(System.out::println);

        // Ordenando por preço
        produtos.sort(Comparator.comparing(Produto::getPreco));
        System.out.println("\nOrdenação por Preço:");
        produtos.forEach(System.out::println);
    }
}
