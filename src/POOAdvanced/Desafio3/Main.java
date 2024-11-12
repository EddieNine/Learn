package POOAdvanced.Desafio3;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2024);

        carro.acelerar(20);
        carro.mostrarInformacoes();

        System.out.println();
        carro.acelerar(30);
        carro.mostrarInformacoes();

        System.out.println();
        carro.frear(20);
        carro.mostrarInformacoes();


    }
}
