package Lambda.Learn.Exemplos.OperacoesEmLista;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(7);
        numeros.add(8);
        numeros.add(3);
        numeros.add(11);
        numeros.add(1);
        numeros.add(12);

        // Filtrar números pares (remover os ímpares)
        numeros.removeIf(n -> n % 2 != 0);

        // Exibir a lista de números pares
        System.out.println("Números pares: " + numeros);

        // Multiplicar cada número por 2
        numeros.replaceAll(n -> n * 2);

        // Exibir a lista após multiplicação
        System.out.println("Números multiplicados por 2: " + numeros);

        // Somar todos os números
        int soma = numeros.stream().reduce(0, (subtotal, n) -> subtotal + n);

        // Exibir o resultado da soma
        System.out.println("Soma de todos os números: " + soma);
    }
}
