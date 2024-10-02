package EstruturaDeDados.HashTables;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ContagemFrequencia {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "python", "java", "c++", "python", "java");
        HashMap<String, Integer> contagem = new HashMap<>();

        for(String palavra: palavras) {
            contagem.put(palavra, contagem.getOrDefault(palavra, 0) + 1);
        }

        System.out.println(contagem);
    }
}
