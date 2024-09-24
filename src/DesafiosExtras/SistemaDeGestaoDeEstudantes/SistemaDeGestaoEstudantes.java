package DesafiosExtras.SistemaDeGestaoDeEstudantes;

public class SistemaDeGestaoEstudantes {
    public static void main(String[] args) {
        Estudante primeiroAluno = new Estudante("Edcarlos", 25, 7.5);
        Estudante segundoAluno = new Estudante("David", 24, 5.0);
        Estudante terceiroAluno = new Estudante("João", 19, 6.8);
        Estudante quartoAluno = new Estudante("Rabinho", 26, 8.8);

        System.out.println("Primeiro aluno:");
        primeiroAluno.exibirInfo();

        System.out.println();
        System.out.println("Segundo aluno:");
        segundoAluno.exibirInfo();

        System.out.println();
        System.out.println("Terceiro aluno:");
        terceiroAluno.exibirInfo();

        System.out.println();
        System.out.println("Quarto aluno:");
        quartoAluno.exibirInfo();
    }
}
