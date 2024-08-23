package ClassesObjetos.Heranca;

public class Main {
    public static void main(String[] args) {
        Pessoa aluno = new Aluno("Edcarlos", 25, "ADS");
        Pessoa professor = new Professor("Daniel", 30, "Engenharia de Software");

        aluno.exibirInformacoes();
        professor.exibirInformacoes();
    }
}
