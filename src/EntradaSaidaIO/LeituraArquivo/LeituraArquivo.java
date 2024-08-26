package EntradaSaidaIO.LeituraArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {
    public static void main(String[] args) {
        String caminhoArquivo = "src/EntradaSaidaIO/LeituraArquivo/novo.txt";  //  caminho do arquivo
        int contagemPalavras = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                // Divide a linha em palavras, usando espaços em branco como delimitadores
                String[] palavras = linha.split("\\s+");  // O regex "\\s+" considera um ou mais espaços em branco
                contagemPalavras += palavras.length;  // Adiciona o número de palavras na linha à contagem total
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        // Exibe o total de palavras encontradas no arquivo
        System.out.println("Total de palavras no arquivo: " + contagemPalavras);
    }
}
