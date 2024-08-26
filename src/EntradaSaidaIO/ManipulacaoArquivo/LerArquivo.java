package EntradaSaidaIO.ManipulacaoArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // src/EntradaSaidaIO/ManipulacaoArquivo/meuArquivo.txt
        System.out.println("Digite o nome do arquivo (com extensão) que deseja ler: ");
        String nomeArquivo = scanner.nextLine();

        try {
            BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
            leitor.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo.");
            e.printStackTrace();
        }
    }
}
