package ArraysColecoes;

public class ArrayDesafios {
    public static void main(String[] args) {
       int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Soma: " + somaArrays(numeros));
        System.out.println("Maior valor: " + maiorValorArrays(numeros));
    }

    public static int somaArrays(int[] arrays) {
        int soma = 0;
        for (int numero : arrays) {
            soma += numero;
        }
        return soma;
    }

    public static int maiorValorArrays(int[] arrays) {
        int maior = 0;
        for (int numero : arrays) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }
}
