package cursoJava2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraBasica extends JFrame {
    private JTextField numero1Field;
    private JTextField numero2Field;
    private JLabel resultadoLabel;

    public CalculadoraBasica() {
        // Configuração da janela
        setTitle("Calculadora Básica");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela

        // Criação dos componentes
        JLabel numero1Label = new JLabel("Número 1:");
        numero1Field = new JTextField(10);
        
        JLabel numero2Label = new JLabel("Número 2:");
        numero2Field = new JTextField(10);
        
        JButton somarButton = new JButton("Somar");
        resultadoLabel = new JLabel("Resultado: ");

        // Adiciona evento ao botão
        somarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                somar();
            }
        });

        // Layout
        setLayout(new GridLayout(4, 2));
        add(numero1Label);
        add(numero1Field);
        add(numero2Label);
        add(numero2Field);
        add(somarButton);
        add(resultadoLabel);

        setVisible(true);
    }

    private void somar() {
        try {
            // Coleta os dados
            double numero1 = Double.parseDouble(numero1Field.getText());
            double numero2 = Double.parseDouble(numero2Field.getText());
            
            // Calcula a soma
            double resultado = numero1 + numero2;
            
            // Exibe o resultado
            resultadoLabel.setText("Resultado: " + resultado);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new CalculadoraBasica();
    }
}
