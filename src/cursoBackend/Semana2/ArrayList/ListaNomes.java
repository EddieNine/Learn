package cursoBackend.Semana2.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        String pessoas;

        System.out.println("Digite os nomes para inserir (digite 'sair' para encerrar):");

        while (true) {
            pessoas = scanner.nextLine();
            if(pessoas.equalsIgnoreCase("sair")) {
                break;
            }
            nomes.add(pessoas);
        }
        System.out.println("\nLista de nomes:");
        for (String name : nomes ) {
            System.out.println(name);
        }

        scanner.close();
    }
}
