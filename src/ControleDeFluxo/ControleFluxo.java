package ControleDeFluxo;

import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();
        
        if (numero > 0){
            System.out.println("Número positivo");
        } else if (numero < 0) {
            System.out.println("Número Negativo");
        } else {
            System.out.println("Número é zero");
        }
    }
}
