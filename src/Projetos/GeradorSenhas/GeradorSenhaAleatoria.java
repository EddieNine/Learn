package Projetos.GeradorSenhas;

import java.security.SecureRandom;

public class GeradorSenhaAleatoria {

    private static final String LETRAS_MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LETRAS_MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMEROS = "0123456789";
    private static final String SIMBOLOS = "!@#$%&*()-_=+<>?";
    
    private static final String TODOS_CARACTERES = LETRAS_MAIUSCULAS + LETRAS_MINUSCULAS +
            NUMEROS + SIMBOLOS;
    private static final SecureRandom RANDOM = new SecureRandom();
    
    public static String gerarSenha(int tamanho) {
        StringBuilder senha = new StringBuilder(tamanho);
        
        for(int i = 0; i < tamanho; i++) {
            int index = RANDOM.nextInt(TODOS_CARACTERES.length());
            senha.append(TODOS_CARACTERES.charAt(index));
        }
        
        return senha.toString();
    }

    public static void main(String[] args) {
        int tamanhoSenha = 12;
        String senhaAleatoria = gerarSenha(tamanhoSenha);
        System.out.println("Senha gerada: " + senhaAleatoria);
    }
}
