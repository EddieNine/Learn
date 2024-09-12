package CollectionsGenerics.HashMapIteradores;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> cidades = new HashMap<>();
        cidades.put("Candeias", 115000);
        cidades.put("São Paulo", 116000);
        cidades.put("Brasilia", 215000);
        cidades.put("Cuiabá", 113000);
        cidades.put("Londres", 225000);

        // Criando um iterador para percorrer o conjunto de entradas (cidade, população)
        Iterator<Map.Entry<String, Integer>> iterator = cidades.entrySet().iterator();

        // Removendo as cidades com população inferior a 200.000
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < 200000) {
                iterator.remove();
            }
        }

        // Exibindo as cidades restantes com população maior ou igual a 200.000
        System.out.println("Cidades com população maior ou igual a 200.000:");
        for(String cidade : cidades.keySet()) {
            System.out.println("Nome: " + cidade + "\nPopulação: " + cidades.get(cidade));
        }
    }
}
