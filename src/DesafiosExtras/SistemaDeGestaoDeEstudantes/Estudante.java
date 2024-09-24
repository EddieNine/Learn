package DesafiosExtras.SistemaDeGestaoDeEstudantes;

public class Estudante {
    private String nome;
    private int idade;
    private double notaFinal;

    public Estudante(String nome, int idade, double notaFinal) {
        this.nome = nome;
        this.idade = idade;
        this.notaFinal = notaFinal;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNotaFinal(){
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota final: " + notaFinal);
        exibirResultadoAprovacao();
    }

    public void exibirResultadoAprovacao(){
        if (notaFinal >= 7.0) {
            System.out.println("Aprovado");;
        } else {
            System.out.println("Reprovado");
        }
    }
}
