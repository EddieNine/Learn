package ArraysColecoes;

import java.util.ArrayList;

public class ListaDeNomes {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Ana");
        nomes.add("Paula");
        nomes.add("José");

        imprimirNome(nomes);
        removerNome(nomes, "Maria");
        imprimirNome(nomes);

    }

    public static void imprimirNome(ArrayList<String> lista) {
        for(String nome : lista) {
            System.out.println(nome);
        }
    }

    public static void removerNome(ArrayList<String> lista, String nome) {
        lista.remove(nome);
    }
}
