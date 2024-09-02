package GUI.Swing.ManipulacaoEventosListeners;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FormularioCadastro {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Usuário");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel emailLabel = new JLabel("E-mail:");
        emailLabel.setBounds(50, 50, 100, 30);
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 50, 200, 30);

        JLabel senhaLabel = new JLabel("Senha:");
        senhaLabel.setBounds(50, 100, 100, 30);
        JPasswordField senhaField = new JPasswordField();
        senhaField.setBounds(150, 100, 200, 30);

        JLabel confirmarSenhaLabel = new JLabel("Confirmar Senha:");
        confirmarSenhaLabel.setBounds(40, 150, 100, 30);
        JPasswordField confirmarSenhaField = new JPasswordField();
        confirmarSenhaField.setBounds(150, 150, 200, 30);

        JCheckBox showPassword = new JCheckBox("Mostrar Senha");
        showPassword.setBounds(150, 180, 150, 30);
        showPassword.addActionListener(e -> {
            if (showPassword.isSelected()) {
                senhaField.setEchoChar((char) 0);
                confirmarSenhaField.setEchoChar((char) 0);
            } else {
                senhaField.setEchoChar('*');
                confirmarSenhaField.setEchoChar('*');
            }
        });

        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setBounds(150, 220, 100, 30);

        cadastrarButton.addActionListener(e -> {
            String confirmarSenha = new String(confirmarSenhaField.getPassword());
            String email = emailField.getText();
            String senha = new String(senhaField.getPassword());
            String emailPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
            String senhaPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&#])[A-Za-z\\d@$!%*?&#]{8,}$";

            if (!senha.equals(confirmarSenha)) {
                JOptionPane.showMessageDialog(null, "As senhas não coincidem.");
            } else {
                if (!email.matches(emailPattern)) {
                    JOptionPane.showMessageDialog(null, "E-mail inválido.");
                } else if (!senha.matches(senhaPattern)) {
                    JOptionPane.showMessageDialog(null, "A senha deve ter pelo menos 8 caracteres, " +
                            "incluindo uma letra maiúscula, " +
                            "uma letra minúscula, um número e um caractere especial.");
                } else {
                    try {
                        salvarDados(email, senha);
                        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao salvar os dados!");
                    }

                }
            }
            emailField.setText("");
            senhaField.setText("");
            confirmarSenhaField.setText("");
        });

        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(senhaLabel);
        frame.add(senhaField);
        frame.add(cadastrarButton);
        frame.add(confirmarSenhaField);
        frame.add(confirmarSenhaLabel);
        frame.add(showPassword);

        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    // Para salvar os dados no arquivo
    private static void salvarDados(String email, String senha) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/GUI/Swing/ManipulacaoEventosListeners/usuarios.txt"));
        writer.write(email + "," + senha);
        writer.newLine();
        writer.close();
    }

    // Para salvar os dados em um Banco de dados
    private static void salvarDadosNoBanco(String email, String senha) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/seubancodedados";
        String user = "seuusuario";
        String password = "suasenha";

        Connection conn = DriverManager.getConnection(url, user ,password);

        String sql = "INSERT INTO usuarios (email, senha) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, email);
        stmt.setString(2, senha);

        stmt.executeUpdate();

        stmt.close();
        conn.close();
    }
}
