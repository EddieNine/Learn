package cursoBackend.Semana2.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Usuario> usuarios = new HashMap<>();
        int opcao;

        do {
            // Exibe o menu de opções
            System.out.println("\nMENU");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Consultar e-mail por nome");
            System.out.println("3 - Exibir todos os usuários");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    // TODO: Pedir nome e e-mail e cadastrar no HashMap
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o e-mail: ");
                    String email = scanner.nextLine();

                    Usuario novoUsuario = new Usuario(nome, email);
                    usuarios.put(nome, novoUsuario);
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;

                case 2:
                    // TODO: Consultar e exibir o e-mail de um nome específico
                    System.out.print("Digite o nome a consultar: ");
                    String nomeConsulta = scanner.nextLine();
                    Usuario u = usuarios.get(nomeConsulta);

                    if (u != null) {
                        System.out.println("E-mail: " + u.getEmail());
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;

                case 3:
                    // TODO: Exibir todos os usuários cadastrados
                    if (usuarios.isEmpty()) {
                        System.out.println("Nenhum usuário cadastrado.");
                    } else {
                        for (Usuario usuario : usuarios.values()) {
                            usuario.exibirInformacoes();
                            System.out.println("-----------------------");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
