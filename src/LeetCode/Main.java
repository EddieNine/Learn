package LeetCode;

public class Main{
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSUm(nums, target);
        
        // Exibir o resultado
        System.out.println("Ìndices: [" + result[0] + ", " + result[1] + "]");
    }
}
