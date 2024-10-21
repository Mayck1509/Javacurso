package cursoJava2024;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorDeCliques extends JFrame {
    private int contador; // Variável para contar os cliques
    private JLabel labelContador; // JLabel para exibir o contador

    public ContadorDeCliques() {
        contador = 0; // Inicializa o contador

        // Configuração da tela/janela
        setTitle("Contador de Cliques");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela

        // Cria um JLabel para mostrar o contador
        labelContador = new JLabel("Clique no botão: " + contador);
        labelContador.setHorizontalAlignment(SwingConstants.CENTER);

        // Cria um botão
        JButton botao = new JButton("Clique aqui");

        // Adiciona um evento escutador ao botão
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++; // Incrementa o contador
                labelContador.setText("Clique no botão: " + contador); // Atualiza o JLabel
            }
        });

        // Layout da interface
        setLayout(new java.awt.BorderLayout());
        add(labelContador, java.awt.BorderLayout.CENTER);
        add(botao, java.awt.BorderLayout.SOUTH);

        // Torna a janela visível
        setVisible(true);
    }

    public static void main(String[] args) {
        // Chama e executa a GUI
        new ContadorDeCliques();
    }
}
