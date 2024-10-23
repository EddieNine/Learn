package DesafiosExtras.HashMap;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "banana"};
        Map<String, Integer> frequencyMap = new HashMap<>();
        
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(frequencyMap);
    }
}
