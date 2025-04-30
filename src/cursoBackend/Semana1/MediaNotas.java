package cursoBackend.Semana1;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resultado = "";


        System.out.println("Digite o nome do aluno: ");
        String aluno = scanner.nextLine();

        System.out.println("Por favor, Digite as 3 notas: ");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7) {
            resultado = "Aprovado";
        } else if (media >= 5) {
            resultado = "Recuperação";
        } else if (media < 5) {
            resultado = "Reprovado";
        }

        System.out.printf("""
        Aluno: %s
        Média: %.1f
        Resultado: %s
        """, aluno, media, resultado);

    }
}
