package POOAdvanced.Desafio;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Bicicleta bicicleta = new Bicicleta();

        // Polimorfismo e interface
        Movimentar carroMovel = new Carro();
        Movimentar bicicletaMovel = new Bicicleta();

        // Testando o comportamento de cada veiculo
        carro.Ligar();
        carro.Buzinar(); // Casting para acessar métodos especificos de Carro
        carroMovel.mover(); // Usando o método da interface Movimentar
        bicicleta.Desligar();

        bicicleta.Ligar();
        bicicleta.Pedalar();
        bicicletaMovel.mover();
        bicicleta.Desligar();
    }
}
