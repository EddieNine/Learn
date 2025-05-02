package cursoBackend.Semana2.IntroducaoPOO5;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Aluno("Lucas");
        Pessoa p2 = new Professor("Mariana");

        p1.apresentar(); // chama o metodo da classe Aluno
        p2.apresentar(); // chama o metodo da classe Aluno
    }
}
