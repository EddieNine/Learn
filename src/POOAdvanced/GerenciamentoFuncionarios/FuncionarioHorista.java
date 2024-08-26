package POOAdvanced.GerenciamentoFuncionarios;

public class FuncionarioHorista implements Funcionario{
    private double horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(double horasTrabalhadas, double valorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario(){
        return horasTrabalhadas * valorHora;
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
