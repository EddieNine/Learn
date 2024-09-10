package POOAdvanced.Desafio;

public class Bicicleta extends Veiculo implements Movimentar{
    @Override
    public void mover(){
        System.out.println("A bicicleta está se movendo.");
    }

    void Pedalar(){
        System.out.println("A bicicleta está pedalando.");
    }
}
