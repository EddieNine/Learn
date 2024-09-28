package DesafiosExtras.SistemaDeBancoExceçoes;

public class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(String titular) {
        this.saldo = 0.0;
        this.titular = titular;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        } else{
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: R$" + saldo);
    }
}
