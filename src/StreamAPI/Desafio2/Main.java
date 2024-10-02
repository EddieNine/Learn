package StreamAPI.Desafio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("David");
        nomes.add("João");
        nomes.add("Fabio");
        nomes.add("Pedro");
        nomes.add("Rafael");
        nomes.add("Edcarlos");
        nomes.add("Jairo");
        nomes.add("Jariel");

        List<String> nomesComJ = nomes.stream()
                .filter(nome -> nome.startsWith("J"))
                .map(String::toUpperCase)
                .sorted()
                .toList();
        System.out.println("Nomes que começam com a letra 'J': " + nomesComJ);

        long quantidadeDeNomesComJ = nomes.stream().filter(n -> n.startsWith("J")).count();
        System.out.println("Quantidade de nomes que começam com 'J': "+ quantidadeDeNomesComJ);
    }
}
