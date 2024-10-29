package StreamAPI.Desafio3;

public class Pessoa {
    private String nome;
    private int idade;
    private String cidade;

    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override

    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
