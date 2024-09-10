package POOAdvanced.Desafio;

public class Carro extends Veiculo implements Movimentar {
    @Override
    public void mover(){
        System.out.println("O carro está se movendo.");
    }

    void Buzinar() {
        System.out.println("O carro está buzinando.");
    }
}
