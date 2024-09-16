package ProgramacaoFuncional.Desafio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 5, 6, 8, 9, 7, 5, 6, 9, 10);

        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 3)
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Números pares: " + pares);
    }
}
