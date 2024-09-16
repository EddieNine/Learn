package ProgramacaoFuncional;

import java.util.Arrays;
import java.util.List;

public class HighOrderFunctions {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        
        // Usando lambda para dobrar cada valor
        List<Integer> dobrados = numeros.stream()
                .map(n -> n * 2)
                .toList();

        System.out.println("Valores dobrados: " + dobrados);
    }
}
