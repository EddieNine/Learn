package ClassesObjetos.Encapsulamento;

// Definição da classe Carro
public class Carro {
    // Atributos (propriedades do carro)
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeAtual;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    // Método (comportamento do carro)
    public void acelerar() {
        velocidadeAtual += 10;
        System.out.println("O carro está acelerando!");
    }

    public void frear() {
        if (velocidadeAtual >= 10) {
            velocidadeAtual -= 10;
            System.out.println("O carro está freando!");
        } else {
            velocidadeAtual = 0;
            System.out.println("O carro já está parado!");
        }
    }

    public void exibirVelocidadeAtual() {
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }
}

