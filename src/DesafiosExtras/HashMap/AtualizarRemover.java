package DesafiosExtras.HashMap;

import java.util.HashMap;
import java.util.Map;

public class AtualizarRemover {
    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("banana", 1);
        fruits.put("orange", 2);
        fruits.put("strawberry", 4);

        // Atualizando o valor de "banana" para 5
        fruits.put("banana", 10);

        // Removendo a chave "strawberry" e seu valor
        fruits.remove("strawberry");

        System.out.println(fruits.get("banana"));
        System.out.println(fruits.get("strawberry"));
    }
}
