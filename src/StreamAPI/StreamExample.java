package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filtrando os números pares
        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("Números pares: " + numerosPares);

        // Mapeando números para seus quadrados
        List<Integer> quadrados = numeros.stream()
                .map(n -> n * n)
                .toList();

        System.out.println("Quadrado dos números: " + quadrados);

        // Somando todos os números
        int soma = numeros.stream()
                .reduce(0, Integer::sum);

        System.out.println("Soma de todos os números: " + soma);
    }
}
