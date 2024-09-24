package DesafiosExtras.SistemaDeFuncionarios;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario) {
        this.nome = nome;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
        System.out.println("Bônus: " + calcularBonus());
    }

    public double calcularBonus() {
        return salario * 0.1;
    }
}
