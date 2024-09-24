package DesafiosExtras.SistemaDeFuncionarios;

public class Gerente extends Funcionario{
    private double bonusExtra;


    public Gerente(String nome, double salario, double bonusExtra) {
        super(nome, salario);
        this.bonusExtra = bonusExtra;
    }

    @Override
    public double calcularBonus(){
        return super.calcularBonus() + bonusExtra;
    }
    
    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Bônus Extra: " + bonusExtra);
    }
}
