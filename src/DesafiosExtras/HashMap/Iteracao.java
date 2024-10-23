package DesafiosExtras.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Iteracao {
    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("banana", 1);
        fruits.put("orange", 2);
        fruits.put("strawberry", 4);

        for(String key : fruits.keySet()) {
            System.out.println(key + ": " + fruits.get(key));
        }

        System.out.println();

        for(Integer value : fruits.values()) {
            System.out.println(value);
        }

        System.out.println();

        for(Map.Entry<String, Integer> entry : fruits.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
