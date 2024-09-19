package EstruturaDeDados.HashTables;

import java.util.HashMap;

public class Exemplo2 {
    public static  void main(String[] args) {
        // Criação de uma Tabela Hash usando HashMap
        HashMap<String, Integer> tabelaHash = new HashMap<>();
        
        // Inserção de pares chave-valor
        tabelaHash.put("João", 30);
        tabelaHash.put("Maria", 30);
        tabelaHash.put("Pedro", 30);
        
        // Acessar valores com base em suas chaves
        System.out.println("Idade de João: " + tabelaHash.get("João"));
        System.out.println("Idade de Maria: " + tabelaHash.get("Maria"));
        System.out.println("Idade de Pedro: " + tabelaHash.get("Pedro"));
        
        // Verificar se uma chave existe
        if (tabelaHash.containsKey("João")) {
            System.out.println("João está na tabela.");
        }
        
        // Remover um par de chave-valor
        tabelaHash.remove("Pedro");
        System.out.println("Tabela após remover Pedro: " + tabelaHash);
        
        // Mostrar todos os elementos
        tabelaHash.forEach((chave, valor) -> System.out.println(chave + " -> " + valor));
    }
}
