package ProgramacaoFuncional.Desafio8;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 5, 8, 9, 5, 6, 8, 2, 5, 66, 85, 8569, 599449);

        // Verifica se todos os números são positivos
        boolean todosPositivos = numeros.stream()
                .allMatch(n -> n > 0);

        if(todosPositivos) {
            System.out.println("Todos os números são positivos.");
        } else {
            System.out.println("Nem todos os números são positivos.");
        }
    }
}
