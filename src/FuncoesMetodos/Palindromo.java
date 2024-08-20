package FuncoesMetodos;

public class Palindromo {
    public boolean isPalindromo(String palavra) {
        String invertida = new StringBuilder(palavra).reverse().toString();
        return palavra.equalsIgnoreCase(invertida);
    }

    public static void main(String[] args) {
        Palindromo verificador = new Palindromo();

        String palavra = "Radar";
        if(verificador.isPalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo");
        } else {
            System.out.println(palavra + " não é um palíndromo");
        }
    }

}
