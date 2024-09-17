package ProgramacaoFuncional.Desafio6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("João", "Paulo", "José", "Juvenal");

        // Agrupar nomes pela primeira letra
        Map<Character, List<String>> agrupamento = nomes.stream()
                .collect(Collectors.groupingBy(nome -> nome.charAt(0)));

        // Exibir os grupos
        agrupamento.forEach((letra, listaNomes) -> {
            System.out.println("Letra: " + letra);
            System.out.println("Nomes: " + listaNomes);
            System.out.println();
        });
    }
}
