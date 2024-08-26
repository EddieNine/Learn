package EntradaSaidaIO.ManipulacaoArquivo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {
    public static void main(String[] args) {
        try {
            File arquivo = new File("meuArquivo.txt");
            if(arquivo.createNewFile()) {
                System.out.println("Arquivo criado: " + arquivo.getName());
            } else {
                System.out.println("Arquivo já existe");
            }

            FileWriter escritor = new FileWriter(arquivo);
            escritor.write("Olá, Mundo!");
            escritor.close();
            System.out.println("Dados escritos no arquivo.");

        } catch (IOException e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
    }
}
