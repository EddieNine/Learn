package DesafiosExtras.SistemaDeGestaoDeTarefas;

import java.util.Scanner;

public class SistemaDeTarefas {
    public static void main(String[] args) {
        GestorTarefas gestor = new GestorTarefas();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Remover tarefa");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o título da tarefa: ");
                    String titulo = scanner.nextLine();
                    gestor.adicionarTarefa(titulo);
                    break;
                case 2:
                    gestor.listarTarefas();
                    break;
                case 3:
                    System.out.println("Digite o número da tarefa a marcar como concluída: ");
                    int numTarefa = scanner.nextInt();
                    gestor.concluirTarefa(numTarefa - 1);
                    break;
                case 4:
                    System.out.println("Digite o número da tarefa a remover: ");
                    int numTarefaRemover = scanner.nextInt();
                    gestor.removerTarefa(numTarefaRemover - 1);
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}
