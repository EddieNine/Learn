package DesafiosExtras.HashMap;

import java.util.HashMap;
import java.util.Map;

public class ContagemDeCaracteres {
    public static void main(String[] args) {
        String palavra =  "banana";

        Map<Character, Integer> contadorDeCaracteres = new HashMap<>();

        for (char c : palavra.toCharArray()) {
            contadorDeCaracteres.put(c, contadorDeCaracteres.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : contadorDeCaracteres.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
