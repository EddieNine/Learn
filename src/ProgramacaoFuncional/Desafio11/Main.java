package ProgramacaoFuncional.Desafio11;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Stream", "API", "Desafio");

    // Contar o número total de caracteres em todas as strings
        int totalCaracteres = palavras.stream()
                .mapToInt(String::length)       // Mapeia o comprimento de cada string para int
                .sum();                         // Soma todos os comprimentos

        System.out.println("Número total de caracteres: " + totalCaracteres);
    }
}
