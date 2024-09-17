package ProgramacaoFuncional.Desafio5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 5, 8, 9, 50, 56, 8, 9, 2);

        int soma = numeros.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);

        System.out.println("A soma de todos os números pares: " + soma);
    }
}
