package DesafiosExtras.SistemaDeGestaoDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class GestorTarefas {

    private List<Tarefa> tarefas;

    public GestorTarefas(){
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String titulo) {
        Tarefa novaTarefa = new Tarefa(titulo);
        tarefas.add(novaTarefa);
        System.out.println("Tarefa '" + titulo + "' adicionada com sucesso!");
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.print((i + 1) + ". ");
                tarefas.get(i).exibirStatus();
            }
        }
    }

    public void concluirTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).marcarConcluida();
            System.out.println("Tarefa '" + tarefas.get(indice).getTitulo() + "' marcada como concluída!");
        } else {
            System.out.println("Ìndice inválido.");
        }
    }

    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            System.out.println("Tarefa '" + tarefas.get(indice).getTitulo() + "' removida com sucesso.");
            tarefas.remove(indice);
        } else {
            System.out.println("Ìndice inválido.");
        }
    }
}
