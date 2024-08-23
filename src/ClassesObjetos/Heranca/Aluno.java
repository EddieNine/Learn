package ClassesObjetos.Heranca;

public class Aluno extends Pessoa{
    private String curso;

    public Aluno(String nome, int idade ,String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Curso: " + curso);
    }
}
