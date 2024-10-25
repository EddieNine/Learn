package DesafiosExtras.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Java", "A high-level programming language.");
        dictionary.put("hashMap", "A data strcture that implements a map interface.");
        
        // Acessar a definição
        System.out.println("Definition of Java: " + dictionary.get("Java"));
    }
}
