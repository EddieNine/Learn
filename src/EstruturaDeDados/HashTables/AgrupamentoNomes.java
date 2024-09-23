package EstruturaDeDados.HashTables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AgrupamentoNomes {
    public static void main(String[] args) {
        List<String> nomes = List.of("Ana", "Bruno", "Alice", "Bernardo", "Carlos", "Cecília");
        HashMap<Character, List<String>> grupos = new HashMap<>();
        
        for(String nome : nomes) {
            char inicial = nome.charAt(0);
            grupos.putIfAbsent(inicial, new ArrayList<>());
            grupos.get(inicial).add(nome);
        }

        System.out.println("Nomes agrupados por inicial: " + grupos);
    }
}
