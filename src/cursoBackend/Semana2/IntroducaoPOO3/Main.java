package cursoBackend.Semana2.IntroducaoPOO3;

public class Main {
    public static void main(String[] args) {
        Endereco end = new Endereco("Rua das Flores", "São paulo", "SP");
        Pessoa pessoa = new Pessoa("Joana", 28, end);
        pessoa.exibirDados();
    }
}
