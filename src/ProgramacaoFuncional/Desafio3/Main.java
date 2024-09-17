package ProgramacaoFuncional.Desafio3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Edcarlos", "David", "João", "Pablo", "Pedro", "Ana");

        List<String> nome = nomes.stream()
                .filter(n -> n.length() > 5)
                .map(n -> n.toUpperCase())
                .sorted()
                .toList();
        System.out.println("Nomes com mais de 5 caracteres: " + nome);
    }
}
