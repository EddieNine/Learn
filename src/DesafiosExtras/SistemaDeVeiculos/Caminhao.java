package DesafiosExtras.SistemaDeVeiculos;

public class Caminhao implements Veiculo{

    @Override
    public void acelerar() {
        System.out.println("O caminhão está acelerando lentamente.");
    }

    @Override
    public void frear(){
        System.out.println("O caminhão está freando.");
    }
}
