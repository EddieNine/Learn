package DesafiosExtras.SistemaDeGestaoDeTarefas;

public class Tarefa {
    private String titulo;
    private boolean concluida;

    public Tarefa(String titulo) {
        this.titulo = titulo;
        this.concluida = false;
    }

    public void marcarConcluida(){
        this.concluida = true;
    }

    public void exibirStatus(){

        String status = (concluida) ? "[Concluída]" : "[Não Concluída]";
        System.out.println(titulo + " - " + status);
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isConcluida() {
        return concluida;
    }
}
