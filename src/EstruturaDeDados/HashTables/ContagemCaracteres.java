package EstruturaDeDados.HashTables;

import java.util.HashMap;

public class ContagemCaracteres {
    public static void main(String[] args) {
        String texto = "programacao";
        HashMap<Character, Integer> contagem = new HashMap<>();
        
        for (char c : texto.toCharArray()) {
            contagem.put(c, contagem.getOrDefault(c, 0) + 1);
        }

        System.out.println("Frequência de caracteres: " + contagem);
    }
}
