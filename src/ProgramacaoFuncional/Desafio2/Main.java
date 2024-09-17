package ProgramacaoFuncional.Desafio2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 5, 8, 9, 7, 5, 6, 8, 1, 50);

        // Filtra números ímpares e multiplica por 2
        List<Integer> numerosInteiros = numeros.stream()
                .filter(n -> n % 2 == 1) // Filtra números ímpares
                .map(n -> n * 2)         // Multiplica por 2
                .toList();
        System.out.println("Números impares, multiplicados por 2: " + numerosInteiros);

        // Soma os números ímpares multiplicados por 2
        int soma = numerosInteiros.stream()
                .reduce(0, Integer::sum); // Soma os resultados
        System.out.println("A soma dos numeros é: " + soma);
    }
}
