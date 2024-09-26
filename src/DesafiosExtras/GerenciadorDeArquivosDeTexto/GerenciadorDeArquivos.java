package DesafiosExtras.GerenciadorDeArquivosDeTexto;

import java.io.*;

public class GerenciadorDeArquivos {

    // Método para escrever em um arquivo
    public void escreverEmArquivo(String nomeArquivo, String conteudo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            writer.write(conteudo);
            System.out.println("Conteúdo escrito no arquivo: " + nomeArquivo);
        } catch (IOException e){
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    // Método para ler o conteúdo de um arquivo
    public void lerArquivo(String nomeArquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    // Método para adicionar conteúdo ao final de um arquivo
    public void adicionarEmArquivo(String nomeArquivo, String conteudo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
            writer.write(conteudo);
            System.out.println("Conteúdo adicionado ao arquivo: " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao adicionar conteúdo ao arquivo: " + e.getMessage());
        }
    }
}
