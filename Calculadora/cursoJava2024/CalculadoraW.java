package cursoJava2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class CalculadoraW extends JFrame implements ActionListener {

    private JTextField display;
    private StringBuilder currentInput;
    private double num1 = 0, num2 = 0;
    private String operator = "";

    public CalculadoraW() {
        // Montando a tela da calculadora
        setTitle("Calculadora");
        setSize(300, 400); // Corrigido de setTitle para setSize
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Montando campo de texto para mostrar resultados:
        display = new JTextField();
        display.setEditable(false); // Mudado para false para não editar o display
        display.setFont(new Font("Arial", Font.BOLD, 24)); // Corrigido a fonte
        add(display, BorderLayout.NORTH);

        // Montando um painel com botões:
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

        // Criando os botões:
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(this); // Adicionado o listener
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        // Inicializar o input atual:
        currentInput = new StringBuilder();
    }

    @Override
    public void actionPerformed(ActionEvent e) { // Corrigido o nome do método
        String command = e.getActionCommand();

        // Lógica para Limpar a tela(display):
        if (command.equals("C")) {
            resetCalculator();
            return;
        }

        // Lógica para operadores:
        if ("/+-*".contains(command)) {
            if (currentInput.length() > 0) {
                try {
                    num1 = Double.parseDouble(currentInput.toString());
                    operator = command;
                    currentInput.setLength(0); // Limpa pro prox numero:
                } catch (NumberFormatException ex) {
                    display.setText("Erro: entrada inválida!");
                    currentInput.setLength(0);
                }
            }
            return;
        }

        // Lógica para o "=" (resultado):
        if (command.equals("=")) {
            if (currentInput.length() > 0) {
                try {
                    num2 = Double.parseDouble(currentInput.toString());
                    double result = calcular(num1, num2, operator);
                    display.setText(String.valueOf(result)); // Corrigido para converter o resultado
                } catch (ArithmeticException ex) {
                    display.setText("Erro: " + ex.getMessage());
                }
                currentInput.setLength(0);
            }
            return;
        }

        // Adicionar dígito ao input atual:
        currentInput.append(command);
        display.setText(currentInput.toString());
    }

    // Método para realizar a operação matemática:
    private double calcular(double num1, double num2, String operator) throws ArithmeticException {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("Divisão por Zero");
                }
                return num1 / num2;
            default:
                return 0;
        }
    }

    // Método para resetar a calculadora:
    private void resetCalculator() {
        currentInput.setLength(0);
        display.setText("");
        num1 = num2 = 0;
        operator = "";
    }

    // Método principal para executar a calculadora
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculadoraW calc = new CalculadoraW() {}; // Criando uma instância anônima
            calc.setVisible(true);
        });
    }
}
