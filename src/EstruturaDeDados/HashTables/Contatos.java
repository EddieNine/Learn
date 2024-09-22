package EstruturaDeDados.HashTables;

import java.util.HashMap;

public class Contatos {
    public static void main(String[] args) {
        HashMap<String, String> contatos = new HashMap<>();
        
        // Inserindo contatos
        contatos.put("Alice", "1234-5678");
        contatos.put("Bob", "9876-5678");
        contatos.put("Carlos", "5555-5678");
        
        // Acessando um contato
        System.out.println("telefone de Alice: " + contatos.get("Alice"));
        
        // Verificando se um contato existe
        if (contatos.containsKey("Bob")) {
            System.out.println("Contato de Bob encontrado.");
        }
        
        // Removendo um contato
        contatos.remove("Carlos");
        System.out.println("Contatos após remoção: " + contatos);
    }
}
