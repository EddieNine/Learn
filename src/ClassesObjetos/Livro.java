package ClassesObjetos;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;

    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Método para exibir detalhes do livro
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
    }

    // Método para verificar se o livro é antigo
    public void ehAntigo() {
        int anoAtual = 2024; // Pode-se usar também LocalDate.now().getYear() para ano dinâmico
        int idade = anoAtual - anoPublicacao;

        if (idade > 50) {
            System.out.println("O livro \"" + titulo + "\" é antigo.");
        } else {
            System.out.println("O livro \"" + titulo + "\" não é antigo.");
        }
    }

    // Método principal para testar a classe Livro
    public static void main(String[] args) {
        Livro livro = new Livro("A Bruxa Má", "Eddie", 1995);

        livro.exibirDetalhes();
        livro.ehAntigo();
    }
}
