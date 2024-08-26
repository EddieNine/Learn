package EntradaSaidaIO.ManipulacaoArquivo;

import java.io.FileOutputStream;
import java.io.IOException;

public class EscritaBinaria {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("dados.bin");

            // Exemplo: Escrevendo uma sequnência de números inteiros
            int[] numeros = {10, 20, 30, 40, 50};

            for (int numero : numeros) {
                fos.write(numero);
            }

            fos.close();
            System.out.println("Dados binários escritos no arquivo.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro durante a escrita binária.");
            e.printStackTrace();
        }
    }
}
