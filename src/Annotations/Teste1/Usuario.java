package Annotations.Teste1;

public class Usuario {

    private String nome;
    private int idade;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    @ValidaMaioridade
    public void verificarMaioridade() {
        if(idade < 18) {
            throw new IllegalArgumentException(nome + " é menor de idade!");
        }
        System.out.println(nome + " é maior de idade;");
    }
}
