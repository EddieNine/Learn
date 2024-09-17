package ProgramacaoFuncional.Desafio9;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Carlos", "Pedro", "Maria");
        List<Integer> idades = Arrays.asList(23, 30, 25, 28);

        // Verifica se as listas têm o mesmo tamanho
        if(nomes.size() != idades.size()) {
            throw new IllegalArgumentException("As listas de nomes e idades devem ter o mesmo tamanho.");
        }

        // Cria uma lista de pares "Nome: Idade"
        List<String> nomesEIdade = nomes.stream()
                .map(nome -> nome + ": " + idades.get(nomes.indexOf(nome)))
                .toList();

        // Exibe a lista de pares "Nome: Idade"
        System.out.println("Lista de nomes e idades:");
        nomesEIdade.forEach(System.out::println);
    }
}
