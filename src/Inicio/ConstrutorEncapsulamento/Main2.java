package Inicio.ConstrutorEncapsulamento;

public class Main2 {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.setTitular("Edcarlos");
        contaBancaria.setSaldo(1500.50);

        System.out.println("Titular: " + contaBancaria.getTitular());
        System.out.println("Saldo: R$" + contaBancaria.getSaldo());
    }
}
