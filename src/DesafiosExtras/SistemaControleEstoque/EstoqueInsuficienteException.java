package DesafiosExtras.SistemaControleEstoque;

public class EstoqueInsuficienteException extends Exception{
    public EstoqueInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
