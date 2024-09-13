package CollectionsGenerics.TreeMapComparadores;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Criando o TreeMap para armazenar produtos e seus respectivos preços
        TreeMap<String, Double> produtos = new TreeMap<>();

        // Adicionando produtos e seus preços
        produtos.put("Arroz", 20.50);
        produtos.put("Feijão", 12.30);
        produtos.put("Leite", 6.80);
        produtos.put("Macarrão", 8.90);
        produtos.put("Pão", 3.50);

        // Exibindo produtos em ordem alfabética (natural do TreeMap)
        System.out.println("Produtos em ordem alfabética:");
        for (Map.Entry<String, Double> entry : produtos.entrySet()) {
            System.out.println("Produto: " + entry.getKey() + ", Preço: " + entry.getValue());
        }

        System.out.println();

        // Convertendo o TreeMap para uma lista de entradas para poder ordenar pelo valor (preço)
        List<Map.Entry<String, Double>> listaProdutos = new ArrayList<>(produtos.entrySet());

        // Ordenando a lista de produtos pelo preço em ordem decrescente usando Comparator
        listaProdutos.sort(new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> p1, Map.Entry<String, Double> p2) {
                return p2.getValue().compareTo(p1.getValue()); // Ordena de forma decrescente
            }
        });

        // Exibindo produtos ordenados por preço de forma decrescente
        System.out.println("Produtos em ordem decrescente de preço:");
        for (Map.Entry<String, Double> entry : listaProdutos) {
            System.out.println("Produto: " + entry.getKey() + ", Preço: " + entry.getValue());
        }
    }
}
