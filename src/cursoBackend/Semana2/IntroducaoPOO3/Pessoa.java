package cursoBackend.Semana2.IntroducaoPOO3;

public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco; // composição

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco.getEnderecoCompleto());
    }
}
