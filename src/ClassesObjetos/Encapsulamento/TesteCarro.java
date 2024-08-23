package ClassesObjetos.Encapsulamento;

// Classe principal para testar a classe Carro
public class TesteCarro {
    public static void main(String[] args) {
        // Instanciando um objeto da classe Carro
        Carro meuCarro = new Carro();

        // Definindo os atributos do objeto
        meuCarro.setMarca("Toyota");
        meuCarro.setModelo("Corolla");
        meuCarro.setAno(2021);
        meuCarro.setVelocidadeAtual(60);

        // Chamando os métodos do objeto
        meuCarro.acelerar();
        meuCarro.frear();
        meuCarro.frear();
        meuCarro.exibirVelocidadeAtual();

        // Exibindo informações sobre o carro
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());
        System.out.println("Velocidade Atual: " + meuCarro.getVelocidadeAtual() + " km/h");
    }
}
