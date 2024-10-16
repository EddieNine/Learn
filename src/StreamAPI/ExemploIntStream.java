package StreamAPI;

import java.util.stream.IntStream;

public class ExemploIntStream {
    public static void main(String[] args) {
        // Criação de um IntStream
        IntStream.range(1, 6)// Gera os números de 1 a 5
                .forEach(System.out::println); // Imprime cada número
    }
}


