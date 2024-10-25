package DesafiosExtras.HashMap;

import java.util.HashMap;
import java.util.Map;

public class FibonnaciMemoization {
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonnaci of " + n + " is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;

        // Verifica se o valor já foi calculado
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Calcula o valor e armazena no HashMap
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }
}
