package DesafiosExtras.SistemaDeFuncionarios;

public class SistemaFuncionarios {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("David", 1400.0);
        Gerente gerente = new Gerente("Rafael", 5000.0, 1000.0);


        System.out.println("Informações do Funcionário:");
        funcionario.exibirInfo();
        System.out.println();

        System.out.println("Informações do Gerente:");
        gerente.exibirInfo();
    }
}
