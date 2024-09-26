package DesafiosExtras.SistemaBancarioComExcecoes;

public class Main {
    public static void main(String[] args) {
        // Criando uma conta com saldo inicial de R$ 1000.00
        ContaBancaria conta = new ContaBancaria(1000.00);

        // Realizando um depósito
        conta.depositar(500.00);
        System.out.println("Saldo atual: R$ " + conta.consultarSaldo());

        // Tentando realizar um saque dentro do limite
        try {
            conta.sacar(300.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Saldo atual: R$ " + conta.consultarSaldo());

        // Tentando realizar um saque acima do limite
        try {
            conta.sacar(1500.00); // Este saque vai gerar uma exceção
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
    }
}
