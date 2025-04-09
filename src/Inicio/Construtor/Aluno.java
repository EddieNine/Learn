package Inicio.Construtor;

public class Aluno {
    String nome;
    String curso;

    public Aluno(String nome, String curso){
        this.nome = nome;
        this.curso = curso;
    }

    void apresentar() {
        System.out.println("Meu nome é " + nome + " e faço o curso de " + curso);
    }
}
