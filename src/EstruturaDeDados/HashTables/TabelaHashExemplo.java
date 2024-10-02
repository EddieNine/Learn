package EstruturaDeDados.HashTables;

import java.util.HashMap;

public class TabelaHashExemplo {
    public static void main(String[] args) {
        HashMap<String, Integer> tabela = new HashMap<>();

        tabela.put("João", 30);
        tabela.put("Maria", 25);
        tabela.put("Pedro", 35);

        System.out.println("Idade de João: " + tabela.get("João"));
    }
}
