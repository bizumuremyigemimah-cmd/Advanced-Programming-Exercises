package Exercise3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

    JTextField num1, num2, result;
    JButton addButton, subtractButton, multiplyButton, divideButton, modulusButton;

    public Calculator() {

        setTitle("Calculator");
        setSize(400, 300);
        setLayout(new GridLayout(6, 2));

        JLabel label1 = new JLabel("First number:");
        JLabel label2 = new JLabel("Second number:");
        JLabel label3 = new JLabel("Result:");

        num1 = new JTextField();
        num2 = new JTextField();
        result = new JTextField();

        result.setEditable(false);

        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");
        multiplyButton = new JButton("Multiply");
        divideButton = new JButton("Divide");
        modulusButton = new JButton("Modulus");

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        modulusButton.addActionListener(this);

        add(label1);
        add(num1);

        add(label2);
        add(num2);

        add(label3);
        add(result);

        add(addButton);
        add(subtractButton);

        add(multiplyButton);
        add(divideButton);

        add(modulusButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double number1 = Double.parseDouble(num1.getText());
        double number2 = Double.parseDouble(num2.getText());

        double answer = 0;

        if (e.getSource() == addButton) {
            answer = number1 + number2;
        }

        else if (e.getSource() == subtractButton) {
            answer = number1 - number2;
        }

        else if (e.getSource() == multiplyButton) {
            answer = number1 * number2;
        }

        else if (e.getSource() == divideButton) {
            answer = number1 / number2;
        }

        else if (e.getSource() == modulusButton) {
            answer = number1 % number2;
        }

        result.setText(String.valueOf(answer));
    }

    public static void main(String[] args) {

        new Calculator();

    }
}