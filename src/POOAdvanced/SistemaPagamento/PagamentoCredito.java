package POOAdvanced.SistemaPagamento;

public class PagamentoCredito extends Pagamento implements Autenticacao{
    @Override
    void realizarPagamento(){
        System.out.println("Pagamento realizado com Cartão de Crédito.");
    }

    @Override
    public boolean autenticar(String senha){
        return senha.equals("senha123");
    }
}
