package POOAdvanced.Desafio2;

public class Tablet extends Dispositivo implements Conectividade{
    @Override
    public void conectarWifi(){
        System.out.println("O tablet está se conectando ao Wifi.");
    }

    void rotacionarTela(){
        System.out.println("O tablet está rotacionando a tela.");
    }

    void fecharTela(){
        System.out.println("O tablet está fechando a tela.");
    }
}
