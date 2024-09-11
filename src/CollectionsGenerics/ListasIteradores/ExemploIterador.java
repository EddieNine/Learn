package CollectionsGenerics.ListasIteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploIterador {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Carlos");
        nomes.add("Ana");

        // Criando um iterador para a lista de nomes
        Iterator<String> iterator = nomes.iterator();

        // Iterando sobre os elementos da lista usando o iterador
        while(iterator.hasNext()) {
            String nome = iterator.next();
            System.out.println(nome);
        }
    }
}
