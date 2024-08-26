package POOAdvanced.GerenciamentoFuncionarios;

public class FuncionarioMensalista implements Funcionario{
    private double salarioMensal;

    public FuncionarioMensalista(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario(){
        return salarioMensal;
    }

    @Override
    public String getDetalhes(){
        return "Funcionário Mensalista, Salário: " + calcularSalario();
    }

    class Endereco {
        private String rua;
        private String cidade;

        public Endereco(String rua, String cidade) {
            this.rua = rua;
            this.cidade = cidade;
        }

        public String getEnderecoCompleto() {
            return rua + ", " + cidade;
        }
    }
}
