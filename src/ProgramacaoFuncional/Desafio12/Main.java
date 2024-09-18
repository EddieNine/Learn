package ProgramacaoFuncional.Desafio12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "João", "Maria", "Fernando", "Lucas", "Beatriz");

        Optional<String> nome = nomes.stream()
                .filter(n -> n.length() > 5)
                .findFirst();

        if(nome.isPresent()) {
            System.out.println("Primeiro nome com mais de 5 letras: " + nome.get());
        } else {
            System.out.println("Nenhum nome com mais de 5 letras foi encontrado.");
        }
    }
}
