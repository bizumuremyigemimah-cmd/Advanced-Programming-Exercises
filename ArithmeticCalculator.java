package Exercise3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ArithmeticCalculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArithmeticCalculator frame = new ArithmeticCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ArithmeticCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First number");
		lblNewLabel.setBounds(34, 35, 82, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(121, 32, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Second number");
		lblNewLabel_1.setBounds(34, 71, 82, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(121, 68, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Result");
		lblNewLabel_2.setBounds(34, 113, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(121, 110, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

btnNewButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {

        double num1 = Double.parseDouble(textField.getText());
        double num2 = Double.parseDouble(textField_1.getText());

        double result = num1 + num2;

        textField_2.setText(String.valueOf(result));
    }
});
			}
		});
		btnNewButton.setBounds(10, 158, 70, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Subtract");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double num2 = Double.parseDouble(textField_1.getText());

				double result = num1 - num2;

				textField_2.setText(String.valueOf(result));
			}
		});
		btnNewButton_1.setBounds(90, 158, 82, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Multiply");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double num2 = Double.parseDouble(textField_1.getText());

				double result = num1 * num2;

				textField_2.setText(String.valueOf(result));
			}
		});
		btnNewButton_2.setBounds(182, 158, 70, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Divide");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double num2 = Double.parseDouble(textField_1.getText());

				double result = num1 / num2;

				textField_2.setText(String.valueOf(result));
			}
		});
		btnNewButton_3.setBounds(263, 158, 70, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Modulus");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double num2 = Double.parseDouble(textField_1.getText());

				double result = num1 % num2;

				textField_2.setText(String.valueOf(result));
			}
		});
		btnNewButton_4.setBounds(343, 158, 81, 23);
		contentPane.add(btnNewButton_4);

	}

}
