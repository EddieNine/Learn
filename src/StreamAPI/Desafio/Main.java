package StreamAPI.Desafio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 5, 6, 7, 8, 10, 15, 20, 25, 90, 66);

        // Filtrar os números que são maiores que 10.
        List<Integer> numerosMaiorQue10 = numeros.stream().filter(n -> n > 10).toList();
        System.out.println("Os números maiores do que 10 são: " + numerosMaiorQue10);

        // Multiplicar cada número por 2.
        List<Integer> multiplicarPor2 = numeros.stream().map(n -> n * 2).toList();
        System.out.println("Os números multiplicados por 2: " + multiplicarPor2);

        // Ordenar os números resultantes em ordem decrescente.
        List<Integer> ordenarDecrecente = numeros.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Números ordenados de forma decrecente: " + ordenarDecrecente);

        // Somar todos os números resultantes e exibir a soma total.
        int soma = numeros.stream().reduce(0, Integer::sum);
        System.out.println("A soma de todos os números: " + soma);
    }
}
