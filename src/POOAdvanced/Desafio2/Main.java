package POOAdvanced.Desafio2;

public class Main {
    public static void main(String[] args) {
        // Usando a interface Conectividade para polimorfismo
        Conectividade smartphoneConectividade = new Smartphone();
        Conectividade tabletConectividade = new Tablet();

        // Usando polimorfismo de Dispositivo
        Dispositivo smartphoneDispositivo = new Smartphone();
        Dispositivo tabletDispositivo = new Tablet();

        // Ações do smartphone
        smartphoneDispositivo.ligar();
        ((Smartphone) smartphoneDispositivo).abrirApp(); // Casting para acessar métodos específicos
        ((Smartphone) smartphoneDispositivo).fecharApp();
        smartphoneConectividade.conectarWifi();
        smartphoneDispositivo.desligar();

        // Ações do tablet
        tabletDispositivo.ligar();
        ((Tablet) tabletDispositivo).rotacionarTela(); // Casting para acessar métodos específicos
        ((Tablet) tabletDispositivo).fecharTela();
        tabletConectividade.conectarWifi();
        tabletDispositivo.desligar();
    }
}
