package DesafiosExtras.HashMap;

import java.util.HashMap;
import java.util.Map;

public class VerificarExistencia {
    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("banana", 1);
        fruits.put("orange", 2);
        fruits.put("strawberry", 4);

        if(fruits.containsKey("banana")) {
            System.out.println("Banana existe!");
        } else {
            System.out.println("Banana não existe!");
        }
        if (fruits.containsValue(2)) {
            System.out.println("O valor 2 existe!");
        } else {
            System.out.println("O valor 2 não existe!");
        }
    }
}
