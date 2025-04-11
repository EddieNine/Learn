package Inicio.ConstrutorEncapsulamento;

public class Produto2 {
    private String nome;
    private double preco;

    public Produto2(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Não é permitido valor negativo. Definindo como R$0.0");
            this.preco = 0.0;
        } else {
            this.preco = preco;
        }
    }

    public double getPreco() {
        return preco;
    }
}
