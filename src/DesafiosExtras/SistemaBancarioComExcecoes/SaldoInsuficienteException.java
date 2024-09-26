package DesafiosExtras.SistemaBancarioComExcecoes;

public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem); // Chama o construtor da classe exception com a mensagem
    }
}
