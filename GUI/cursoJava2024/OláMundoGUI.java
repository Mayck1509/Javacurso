package cursoJava2024;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OláMundoGUI extends JFrame {
    public OláMundoGUI() {
        // Configuração da tela/janela:
        setTitle("Olá Mundo em JAVA");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela

        // Cria um botão:
        JButton botao = new JButton("Clique em mim");

        // Adicionar um evento escutador:
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exibe um popup com a mensagem "Olá Mundo"
                JOptionPane.showMessageDialog(null, "Olá Mundo");
            }
        });

        // Adiciona o botão à janela
        add(botao);

        // Torna a janela visível:
        setVisible(true);
    }

    public static void main(String[] args) {
        // Chama e executa a GUI
        new OláMundoGUI();
    }
}