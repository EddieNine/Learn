package DesafiosExtras.SistemaDeVeiculos;

import java.util.ArrayList;
import java.util.List;

public class SistemaVeiculos {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro());
        veiculos.add(new Moto());
        veiculos.add(new Caminhao());

        for (Veiculo v : veiculos) {
            v.acelerar();
            v.frear();
            System.out.println();
        }
    }
}
