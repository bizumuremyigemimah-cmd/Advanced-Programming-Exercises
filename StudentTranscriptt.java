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

public class StudentTranscriptt extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton;
	private JLabel lblNewLabel_4;
	private JTextField textField_4;
	private JLabel lblNewLabel_5;
	private JTextField textField_5;
	private JLabel lblNewLabel_6;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentTranscriptt frame = new StudentTranscriptt();
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
	public StudentTranscriptt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Name");
		lblNewLabel.setBounds(48, 29, 116, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(201, 26, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Java Mark");
		lblNewLabel_1.setBounds(48, 54, 97, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(201, 51, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Database Mark");
		lblNewLabel_2.setBounds(48, 79, 97, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(201, 76, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Networking Mark");
		lblNewLabel_3.setBounds(48, 109, 116, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(201, 107, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		btnNewButton = new JButton("Generate Transcript");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
double javaMark = Double.parseDouble(textField_1.getText());
double databaseMark = Double.parseDouble(textField_2.getText());
double networkingMark = Double.parseDouble(textField_3.getText());

double total = javaMark + databaseMark + networkingMark;
double average = total / 3;

textField_4.setText(String.valueOf(total));
textField_5.setText(String.valueOf(average));

String result;

if (average >= 50) {
    result = "PASS";
} else {
    result = "FAIL";
}

textField_6.setText(result);
			}
		});
		btnNewButton.setBounds(48, 193, 151, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel_4 = new JLabel("Total");
		lblNewLabel_4.setBounds(98, 134, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(201, 131, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Average");
		lblNewLabel_5.setBounds(98, 168, 97, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(201, 162, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Result");
		lblNewLabel_6.setBounds(88, 233, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(155, 227, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

	}

}
