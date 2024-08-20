package ArraysColecoes;

public class ArrayDesafios {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Soma: " + somaArrays(numeros));
        System.out.println("Maior valor: " + maiorValorArray(numeros));
    }

    public static int somaArrays(int[] arrays) {
        int soma = 0;
        for (int numeros : arrays) {
            soma += numeros;
        }
        return soma;
    }

    public static int maiorValorArray(int[] arrays) {
        int maior = arrays[0];
        for (int numeros : arrays) {
            if (numeros > maior) {
                maior = numeros;
            }
        }
        return maior;
    }
}
