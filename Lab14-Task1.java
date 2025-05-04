package com.mycompany.calculator;

import javax.swing.*; // Used for building graphical user interfaces (GUIs)
import java.awt.*; // Provides basic GUI components and layout managers by Abstract Window Toolkit (AWT)
import java.awt.event.*; // Enables the program to respond to user interactions

// JFrame -> A window with minimize, maximize, and close buttons
// ActionListener -> Handle action events
public class Calculator extends JFrame implements ActionListener { 
    private final JTextField display; // Displays user input and result 
    private double firstOperand = 0;
    private String operator = "";
    private boolean startNewNumber = true;

    public Calculator(String title) {
        super(title);
        setLayout(new BorderLayout());

        // Display field
        display = new JTextField("0");
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Button panel with a 4x4 grid layout and 5-pixel gaps between components
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] labels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };
        for (String label : labels) {
            JButton btn = new JButton(label);
            btn.setFont(new Font("Arial", Font.PLAIN, 20));
            btn.addActionListener(this);
            buttonPanel.add(btn);
        }
        add(buttonPanel, BorderLayout.CENTER);

        // Window settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400); // window size to 300 pixels wide and 400 pixels tall.
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if ("0123456789.".contains(cmd)) {
            if (startNewNumber) {
                display.setText(cmd);
                startNewNumber = false;
            } else {
                display.setText(display.getText() + cmd);
            }
        } else if ("+-*/".contains(cmd)) {
            firstOperand = Double.parseDouble(display.getText());
            operator = cmd;
            startNewNumber = true;
        } else if ("=".equals(cmd)) {
            double secondOperand = Double.parseDouble(display.getText());
            double result = 0;
            switch (operator) {
                case "+": result = firstOperand + secondOperand; break;
                case "-": result = firstOperand - secondOperand; break;
                case "*": result = firstOperand * secondOperand; break;
                case "/": result = firstOperand / secondOperand; break;
            }
            display.setText(String.valueOf(result));
            startNewNumber = true;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator("Welcome!"));
    }
}
