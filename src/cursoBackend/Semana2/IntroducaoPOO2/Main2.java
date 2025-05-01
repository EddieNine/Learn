package cursoBackend.Semana2.IntroducaoPOO2;

public class Main2 {
    public static void main(String[] args) {
        ContaBancaria2 contaBancaria2 = new ContaBancaria2("Maria", -50); // Saldo inválido

        contaBancaria2.depositar(500);
        contaBancaria2.sacar(100);
        contaBancaria2.sacar(-30); // valor inválido
        contaBancaria2.depositar(-200); // valor inválido
        contaBancaria2.exibirSaldo();
    }
}
