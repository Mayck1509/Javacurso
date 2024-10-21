package cursoJava2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioSimples extends JFrame {
    private JTextField nomeField;
    private JTextField idadeField;

    public FormularioSimples() {
        // Configuração da janela
        setTitle("Formulário Simples");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela

        // Criação dos componentes
        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField(15);

        JLabel idadeLabel = new JLabel("Idade:");
        idadeField = new JTextField(3);

        JButton exibirButton = new JButton("Exibir Informações");

        // Adiciona evento ao botão
        exibirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exibirInformacoes();
            }
        });

        // Layout
        setLayout(new GridLayout(3, 2));
        add(nomeLabel);
        add(nomeField);
        add(idadeLabel);
        add(idadeField);
        add(exibirButton);

        setVisible(true);
    }

    private void exibirInformacoes() {
        String nome = nomeField.getText();
        String idade = idadeField.getText();

        // Exibe as informações em um JOptionPane
        JOptionPane.showMessageDialog(this, "Nome: " + nome + "\nIdade: " + idade, "Informações do Usuário", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new FormularioSimples();
    }
}
