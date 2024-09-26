package DesafiosExtras.GerenciadorDeArquivosDeTexto;

public class SistemasDeArquivos {
    public static void main(String[] args) {
        /// Instanciando o Gerenciador de Arquivos
        GerenciadorDeArquivos gerenciador = new GerenciadorDeArquivos();

        // Nome do arquivo a ser manipulado
        String nomeArquivo = "ArquivoTexto.txt";

        // Escrevendo no arquivo (sobrescreve o arquivo)
        gerenciador.escreverEmArquivo(nomeArquivo, "Primeira frase no arquivo.\n");

        // Lendo o conteúdo do arquivo
        System.out.println("Conteúdo do arquivo após a escrita:");
        gerenciador.lerArquivo(nomeArquivo);

        // Adicionando conteúdo ao final do arquivo
        gerenciador.adicionarEmArquivo(nomeArquivo, "Segunda frase adicionada ao arquivo.\n");

        // Lendo o conteúdo atualizado do arquivo
        System.out.println("Conteúdo do arquivo após adicionar conteúdo");
        gerenciador.lerArquivo(nomeArquivo);
    }
}
