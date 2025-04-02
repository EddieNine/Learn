package Inicio.Variaveis;

public class Main2 {
    public static void main(String[] args) {
        String nome = "Edcarlos";
        double peso = 95;
        double altura = 1.85;
        boolean estudandoJava = true;
        double IMC = peso / (altura * altura);

        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Está estudando Java? " + estudandoJava);
        System.out.printf("IMC: %.2f", IMC);
    }
}
