package EstruturaDeDados.Stacks;

import java.util.Stack;

public class PilhaExemplo {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Topo da pilha: " + pilha.peek());
        pilha.pop();
        System.out.println("Novo topo da pilha: " + pilha.peek());
    }
}
