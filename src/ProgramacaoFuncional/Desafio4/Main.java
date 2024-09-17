package ProgramacaoFuncional.Desafio4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 5, 8, 9, 6, 5, 2, 15, 25, 28);

        Optional<Integer> maiorNumeroPar = numeros.stream()
                .filter(n -> n % 2 == 0) // Filtra os números pares
                .max(Integer::compareTo); // Encontra o maior número

        if(maiorNumeroPar.isPresent()) {
            System.out.println("O maior número par é: " + maiorNumeroPar.get());
        } else {
            System.out.println("Não há números pares na lista.");
        }

    }
}
