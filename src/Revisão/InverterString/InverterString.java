package Revisão.InverterString;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        //2
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string: ");
        String string = scanner.nextLine();

        String reverso = new StringBuilder(string).reverse().toString();

        if(string.isEmpty()) {
            System.out.println("Por favor, digite uma string.");
            return;
        } else {
            System.out.println("String padrão: " + string);
            System.out.println("String invertida: " + reverso);
        }
    }
}
