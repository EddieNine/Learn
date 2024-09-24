package DesafiosExtras.SistemaDePagamento;

public class CartaoCredito implements MetodoPagamento{

    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento de R$ %.2f realizado com Cartão de Crédito.", valor);
    }
}
