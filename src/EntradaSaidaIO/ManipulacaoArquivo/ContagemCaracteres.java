package EntradaSaidaIO.ManipulacaoArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ContagemCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo (com extensão) que deseja ler: ");
        String nomeArquivo = scanner.nextLine();

        int contadorCaracteres = 0;

        try {
            BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
            int caractere;
            while ((caractere = leitor.read()) != -1) {
                contadorCaracteres++;
            }
            leitor.close();

            System.out.println("Total de caracteres no arquivo: " + contadorCaracteres);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo.");
            e.printStackTrace();
        }
    }
}
