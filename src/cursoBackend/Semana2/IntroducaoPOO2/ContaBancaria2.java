package cursoBackend.Semana2.IntroducaoPOO2;

public class ContaBancaria2 {
    private String titular;
    private double saldo;

    public ContaBancaria2(String titular, double saldo){
        this.titular = titular;
        if(saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inicial inválido. Definido como 0.");
            this.saldo = 0;
        }
    }

    public void depositar(double valor) {
        if(validarValor(valor)) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        }
    }

    public void sacar(double valor) {
        if(!validarValor(valor)) return;

        if(valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;;
            System.out.println("Saque realizado com sucesso.");
        }
    }

    public void exibirSaldo(){
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }

    private boolean validarValor(double valor) {
        if (valor <= 0) {
            System.out.println("O valor deve ser maior que zero.");
            return false;
        }
        return true;
    }

    public double getSaldo(){
        return saldo;
    }
}
