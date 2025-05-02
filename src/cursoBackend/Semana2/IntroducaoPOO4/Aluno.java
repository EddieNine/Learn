package cursoBackend.Semana2.IntroducaoPOO4;

public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade); // chama o construtor da superclasse
        this.matricula = matricula;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matricula: " + matricula);
    }
}
