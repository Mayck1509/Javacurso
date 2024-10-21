package cursoJava2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraIMC_IAC extends JFrame {
    private JTextField pesoField;
    private JTextField alturaField;
    private JTextField quadrilField;
    private JTextArea resultadoArea;

    public CalculadoraIMC_IAC() {
        // Configuração da janela
        setTitle("Calculadora IMC e IAC");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela

        // Criação dos componentes
        JLabel pesoLabel = new JLabel("Peso (kg):");
        pesoField = new JTextField(10);
        
        JLabel alturaLabel = new JLabel("Altura (m):");
        alturaField = new JTextField(10);
        
        JLabel quadrilLabel = new JLabel("Quadril (cm):");
        quadrilField = new JTextField(10);

        JButton calcularButton = new JButton("Calcular");
        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        
        // Adiciona evento ao botão
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        // Layout
        setLayout(new GridLayout(5, 2));
        add(pesoLabel);
        add(pesoField);
        add(alturaLabel);
        add(alturaField);
        add(quadrilLabel);
        add(quadrilField);
        add(calcularButton);
        add(new JScrollPane(resultadoArea)); // Adiciona a área de resultado

        setVisible(true);
    }

    private void calcular() {
        try {
            // Coleta os dados
            double peso = Double.parseDouble(pesoField.getText());
            double altura = Double.parseDouble(alturaField.getText());
            double quadril = Double.parseDouble(quadrilField.getText()) / 100.0; // cm para m
            
            // Cálculo do IMC
            double imc = peso / (altura * altura);
            String classificacaoIMC;
            if (imc < 18.5) {
                classificacaoIMC = "Abaixo do peso";
            } else if (imc < 24.9) {
                classificacaoIMC = "Peso normal";
            } else if (imc < 29.9) {
                classificacaoIMC = "Sobrepeso";
            } else {
                classificacaoIMC = "Obesidade";
            }

            // Cálculo do IAC
            double iac = (peso / (altura * altura)) + (quadril * 0.10) - 5.0;

            // Exibe resultados
            String resultado = String.format("IMC: %.2f (%s)\nIAC: %.2f", imc, classificacaoIMC, iac);
            resultadoArea.setText(resultado);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new CalculadoraIMC_IAC();
    }
}
