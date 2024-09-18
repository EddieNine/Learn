package ProgramacaoFuncional.Desafio10;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 5, 6 ,9 ,8 ,7 ,8, 0, 12);

        // Filtrar os números maiores que 10 e calcular a média
        OptionalDouble media = numeros.stream()
                .filter(n -> n > 10) // Filtra números maiores que 10
                .mapToInt(n -> n) // Mapeia para int
                .average(); // Calcula a média

        // Verifica se há resultado e exibe a média
        if(media.isPresent()){
            System.out.println("A média dos números maiores que 10 é: " + media.getAsDouble());
        } else {
            System.out.println("Não há números maiores que 10.");
        }

    }
}
