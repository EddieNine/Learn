package Inicio.Metodos;

public class Main {
    public static String boasVindas(String nome) {
        return "Bem-vindo, " + nome + "!";
    }

    public static void main(String[] args) {
        String mensagem = boasVindas("Edcarlos");
        System.out.println(mensagem);
    }
}
