package EstruturaDeDados.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class FilaExemplo {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        fila.add(10);
        fila.add(20);
        fila.add(30);

        System.out.println("Frente da fila: " + fila.peek());
        fila.poll();
        System.out.println("Nova frente da fila: " + fila.peek());
    }
}
