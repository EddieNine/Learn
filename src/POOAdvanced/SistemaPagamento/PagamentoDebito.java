package POOAdvanced.SistemaPagamento;

public class PagamentoDebito extends Pagamento implements Autenticacao{
    @Override
    void realizarPagamento(){
        System.out.println("Pagamento realizado com Cartão de Débito.");
    }

    @Override
    public boolean autenticar(String senha) {
        return senha.equals("senha123");
    }
}
