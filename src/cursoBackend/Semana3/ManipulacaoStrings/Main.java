package cursoBackend.Semana3.ManipulacaoStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Receber a frase do usuário
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Inverter a ordem das palavras
        String[] palavras = frase.split(" "); // Divide a frase em palavras
        StringBuilder fraseInvertida = new StringBuilder();
        for (int i = palavras.length - 1; i >= 0; i--) {
            fraseInvertida.append(palavras[i]).append(" "); // Adiciona as palavras em ordem reversa
        }
        System.out.println("Inversão das palavras: " + fraseInvertida.toString().trim()); // Exibe a frase invertida

        // Contar quantas vezes a letra 'a' aparece
        int contagemA = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') { // Conta 'a' ou 'A'
                contagemA++;
            }
        }
        System.out.println("Quantidade de letras 'a' na frase: " + contagemA);

        // Substituir uma palavra por outra
        System.out.println("Digite a palavra que deseja substituir: ");
        String palavraAntiga = scanner.nextLine();
        System.out.println("Digite a nova palavra: ");
        String palavraNova = scanner.nextLine();
        String fraseAlterada = frase.replace(palavraAntiga, palavraNova); // Substitui a palavra
        System.out.println("Nova frase: " + fraseAlterada);

        scanner.close();
    }
}
