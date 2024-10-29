package StreamAPI.Desafio3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
            new Pessoa("Alice", 25, "São Paulo"),
            new Pessoa("Bruno", 17, "Rio de Janeiro"),
            new Pessoa("Alice", 30, "Curitiba"),
            new Pessoa("Carlos", 19, "Salvador"),
            new Pessoa("Diana", 22, "Fortaleza"),
            new Pessoa("Bruno", 20, "Brasília")
        );

        List<String> nomesFiltrados = pessoas.stream()
                .filter(p -> p.getIdade() > 18)
                .sorted(Comparator.comparing(Pessoa::getIdade))
                .map(Pessoa::getNome)
                .distinct()
                .collect(Collectors.toList());

        nomesFiltrados.forEach(System.out::println);


    }
}
