package ProgramacaoFuncional.Desafio13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // Remover todos os números ímpares
        numeros.removeIf(n -> n % 2 != 0);

        System.out.println("Lista após remover números ímpares: " + numeros);
    }
}
