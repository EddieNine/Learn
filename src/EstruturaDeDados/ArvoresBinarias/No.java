package EstruturaDeDados.ArvoresBinarias;

class No {
    int valor;
    No esquerdo, direito;

    public No(int item) {
        valor = item;
        esquerdo = direito = null;
    }
}

class ArvoreBinaria {
    No raiz;

    ArvoreBinaria() {
        raiz = null;
    }

    void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    No inserirRecursivo(No raiz, int valor) {
        if(raiz == null) {
            raiz = new No(valor);
            return raiz;
        }

        if (valor < raiz.valor) {
            raiz.esquerdo = inserirRecursivo(raiz.esquerdo, valor);
        } else if (valor > raiz.valor) {
            raiz.direito = inserirRecursivo(raiz.direito, valor);
        }

        return raiz;
    }
}
