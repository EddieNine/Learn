package DesafiosExtras.SistemaDePagamento;

import java.util.ArrayList;
import java.util.List;

public class SistemaPagamentos {
    public static void main(String[] args) {
        List<MetodoPagamento> pagamentos = new ArrayList<>();
        pagamentos.add(new CartaoCredito());
        pagamentos.add(new Boleto());

        // Valor do pagamento
        double valor = 100.0;

        // Para cada método de pagamento, chamar o método pagar
        for (MetodoPagamento pagamento : pagamentos) {
            pagamento.pagar(valor);
        }
    }
}
