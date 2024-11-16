package Annotations.Teste1;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Edcarlos", 20);
        Usuario usuario2 = new Usuario("João", 16);

        // Validar os usuários
        System.out.println("Validando o usuário 1:");
        InterpretadorDeAnnotations.validar(usuario1);

        System.out.println("\nValidando o usuário 2:");
        InterpretadorDeAnnotations.validar(usuario2);
    }
}
