package Inicio.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] numeros = {10, 50, 60, 25, 18, 16};
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        double media = (double) soma / numeros.length;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
