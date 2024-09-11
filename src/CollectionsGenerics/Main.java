package CollectionsGenerics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        HashMap<String, Integer> pessoas = new HashMap<>();

        nomes.add("Joãozito");
        nomes.add("Pedrovinks");
        nomes.add("Samuelielson");
        nomes.add("Salaskiel");
        nomes.add("Pedrosvaldo");

        for(String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println();

        pessoas.put("Jubileu", 15);
        pessoas.put("Josefina", 16);
        pessoas.put("Jabora", 20);
        pessoas.put("Jilcredison", 25);
        pessoas.put("Janibora", 22);

        for (String nome : pessoas.keySet() ) {
            System.out.println(nome + " tem " + pessoas.get(nome) + " anos");
        }

        System.out.println();

        Par<String, Integer> parExemplo = new Par<>("Exemplo", 123);
        System.out.println("Primeiro: " + parExemplo.getPrimeiro());
        System.out.println("Segundo: " + parExemplo.getSegundo());
    }
}
