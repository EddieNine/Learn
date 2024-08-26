package EntradaSaidaIO.ManipulacaoArquivo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo (com extensão): ");
        String nomeArquivo = scanner.nextLine();

        System.out.println("Digite o conteúdo que deseja adicionar ao arquivo: ");
        String conteudo = scanner.nextLine();

        try {
            File arquivo = new File(nomeArquivo);
            if(arquivo.createNewFile()) {
                System.out.println("Arquivo criado: " + arquivo.getName());
            } else {
                System.out.println("Arquivo já existe");
            }

            FileWriter escritor = new FileWriter(arquivo);
            escritor.write(conteudo);
            escritor.close();
            System.out.println("Dados escritos no arquivo.");

        } catch (IOException e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
    }
}
