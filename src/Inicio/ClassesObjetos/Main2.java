package Inicio.ClassesObjetos;

public class Main2 {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.titulo = "O senhor dos Anéis";
        livro.autor = "J.R.R. Tolkien";
        livro.ano = 1954;

        livro.detalhes();
    }
}
