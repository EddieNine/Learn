package cursoBackend.Semana2.IntroducaoPOO5;

public class Aluno extends Pessoa{
    public Aluno(String nome) {
        super(nome);
    }

    @Override
    public void apresentar(){
        System.out.println("Olá, eu sou um aluno e meu nome é " + getNome());
    }

    public String getNome() {
        return getClass().getSuperclass().getDeclaredFields()[0].getName();
    }
}
