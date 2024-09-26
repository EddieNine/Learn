package DesafiosExtras.SistemaBancarioComExcecoes;

public class ContaBancaria {
    private double saldo;

    // Construtor da classe
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    // Método para sacar dinheiro, que lança a exceção personalizada se o saldo for insuficiente
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            // Lança a exceção personalizada
            throw new SaldoInsuficienteException("Erro: Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
        System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
    }

    // Método para consultar o saldo atual
    public double consultarSaldo() {
        return saldo;
    }
}
