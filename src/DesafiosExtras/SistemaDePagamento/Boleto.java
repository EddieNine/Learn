package DesafiosExtras.SistemaDePagamento;

public class Boleto implements MetodoPagamento{

    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento de R$ %.2f realizado com Cartão com Boleto.", valor);
    }
}
