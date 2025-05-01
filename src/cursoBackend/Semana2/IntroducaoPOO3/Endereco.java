package cursoBackend.Semana2.IntroducaoPOO3;

public class Endereco {
    private String rua;
    private String cidade;
    private String estado;

    public Endereco(String rua, String cidade, String estado) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getEnderecoCompleto(){
        return rua + ", " + cidade + " - " + estado;
    }
}
