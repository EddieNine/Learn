package Revisão.Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // 2

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de termos da sequência de fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("Sequência de fibonnaci até o " + n + "° termo");
        exibirFibonacci(n);
        
        scanner.close();
    }      
    
    public static void exibirFibonacci(int n) {
        long a = 0; long b = 1;

        System.out.print(a + " " + b + " ");
        
        for(int i = 2; i < n; i++) {
            long c = a + b;
            System.out.print(c + " ");
            
            a = b;
            b = c;
        }

        System.out.println();
    }
}
