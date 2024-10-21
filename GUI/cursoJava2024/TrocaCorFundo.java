package cursoJava2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrocaCorFundo extends JFrame {
    private JPanel painel;
    private Color corOriginal;

    public TrocaCorFundo() {
        // Configuração da janela
        setTitle("Troca de Cor de Fundo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela

        // Criação do painel
        painel = new JPanel();
        painel.setLayout(new FlowLayout());
        corOriginal = painel.getBackground(); // Armazena a cor original

        // Criação dos botões
        JButton vermelhoButton = new JButton("Vermelho");
        JButton azulButton = new JButton("Azul");
        JButton verdeButton = new JButton("Verde");
        JButton amareloButton = new JButton("Amarelo");
        JButton cianoButton = new JButton("Ciano");
        JButton magentaButton = new JButton("Magenta");
        JButton restaurarButton = new JButton("Restaurar Cor Original");
        JButton seletorCorButton = new JButton("Selecionar Cor");

        // Adiciona eventos aos botões
        vermelhoButton.addActionListener(e -> painel.setBackground(Color.RED));
        azulButton.addActionListener(e -> painel.setBackground(Color.BLUE));
        verdeButton.addActionListener(e -> painel.setBackground(Color.GREEN));
        amareloButton.addActionListener(e -> painel.setBackground(Color.YELLOW));
        cianoButton.addActionListener(e -> painel.setBackground(Color.CYAN));
        magentaButton.addActionListener(e -> painel.setBackground(Color.MAGENTA));
        
        restaurarButton.addActionListener(e -> painel.setBackground(corOriginal));
        
        seletorCorButton.addActionListener(e -> {
            Color corSelecionada = JColorChooser.showDialog(null, "Escolha uma Cor", corOriginal);
            if (corSelecionada != null) {
                painel.setBackground(corSelecionada);
            }
        });

        // Adiciona os botões ao painel
        painel.add(vermelhoButton);
        painel.add(azulButton);
        painel.add(verdeButton);
        painel.add(amareloButton);
        painel.add(cianoButton);
        painel.add(magentaButton);
        painel.add(restaurarButton);
        painel.add(seletorCorButton);

        // Adiciona o painel à janela
        add(painel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TrocaCorFundo();
    }
}
