package CollectionsGenerics.ListaObjetosIteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de produtos
        List<Produto> produtos =  new ArrayList<>();

        // Adcicionando produtos à lista
        produtos.add(new Produto("Televisão", 1200.00));
        produtos.add(new Produto("Notebook", 2500.00));
        produtos.add(new Produto("Smartphone", 900.00));
        produtos.add(new Produto("Fone de Ouvido", 45.00));
        produtos.add(new Produto("Carregador", 30.00));
        produtos.add(new Produto("Mouse", 20.00));

        // Criando um iterador para percorrer a lista
        Iterator<Produto> iterator = produtos.iterator();

        // Removendo produtos com preco menor que 50
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            if (produto.getPreco() < 50.00) {
                iterator.remove(); // Removendo o produto
            }
        }

        // Exibindo a lista de produtos restantes
        System.out.println("Produtos com preço maior ou igual a 50.00:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
