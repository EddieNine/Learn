package POOAdvanced.Desafio3;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar(int incremento) {
        velocidadeAtual += incremento;
    }

    public void frear(int decremento) {
        velocidadeAtual -= decremento;
        if(velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

    public void mostrarInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade Atual: " + velocidadeAtual);
    }
}
