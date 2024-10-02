package ProgramacaoFuncional.Desafio7;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 1, 1, 2, 5, 6, 5, 6, 8, 9, 10, 5, 6, 3, 8, 8);

        List<Integer> removerDuplicados = numeros.stream()
                .distinct()
                .sorted()
                .toList();
        System.out.println("Valores duplicados removidos: " + removerDuplicados);
    }
}
