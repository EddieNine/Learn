package cursoBackend.Semana2.IntroducaoPOO4;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lucas", 20, "20241001");
        Professor professor = new Professor("Mariana", 35, "Matemática");

        System.out.println("Dados do Aluno:");
        aluno.exibirDados();

        System.out.println("\nDados do Professor:");
        professor.exibirDados();
    }
}
