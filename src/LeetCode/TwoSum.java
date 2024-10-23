package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSUm(int[] nums, int target) {
        // Criando um HashMap para armazenar números e seus índices
        Map<Integer, Integer> map = new HashMap<>();

        // Percorrendo o array de números
        for (int i = 0; i < nums.length; i++) {
            // Calculando o complemento que, somado ao número atual, resulta no target
            int complement = target - nums[i];

            // Verificar se o complemento já está no HashMap
            if (map.containsKey(complement)) {
                // Se o complemento estiver no HashMap, retornamos os índices
                return new int[] { map.get(complement), i };
            }

            // Se o complemento não estiver no HashMap, adicionamos o número atual e seu índice
            map.put(nums[i], i);
        }

        // Caso não encontre a solução, lança uma exceção (mas sempre haverá uma solução)
        throw new IllegalArgumentException("No two sum solution");
    }
}

