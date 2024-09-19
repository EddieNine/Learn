package EstruturaDeDados.LinkedLists;

class No {
    int valor;
    No proximo;

    No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

class ListaEncadeada {
    No cabeca;

    public void adicionar(int valor) {
        No novoNo = new No(valor);
        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            No atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    public void mostrar() {
        No atual = cabeca;
        while (atual != null) {
            System.out.println(atual.valor + " ");
            atual = atual.proximo;
        }
    }
}

