package POOAdvanced.Desafio2;

public class Smartphone extends Dispositivo implements Conectividade{
    @Override
    public void conectarWifi(){
        System.out.println("O smartphone está se conectando ao Wifi.");
    }

    void abrirApp(){
        System.out.println("O smartphone está abrindo o app.");
    }

    void fecharApp(){
        System.out.println("O smartphone está fechando o app.");
    }
}
