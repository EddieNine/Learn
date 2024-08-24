package ClassesObjetos.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();

        veiculo.mover();
        carro.mover();
        bicicleta.mover();
    }
}
