package cursoBackend.Semana2.IntroducaoPOO2;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("João", 1000);
        System.out.println("Saldo Atual: " + contaBancaria.getSaldo());
        System.out.println();

        contaBancaria.depositar(200);
        System.out.println("Saldo após o deposito: " + contaBancaria.getSaldo());
        System.out.println();

        contaBancaria.sacar(150);
        System.out.println("Saldo após o saque: " + contaBancaria.getSaldo());
        System.out.println();

        System.out.println("Detalhes:");
        contaBancaria.exibirSaldo();
    }
}
