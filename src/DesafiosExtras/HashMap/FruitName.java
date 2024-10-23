package DesafiosExtras.HashMap;

import java.util.HashMap;
import java.util.Map;

public class FruitName {
    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("banana", 1);
        fruits.put("orange", 2);
        fruits.put("strawberry", 4);

        System.out.println(fruits.get("banana"));
    }
}
