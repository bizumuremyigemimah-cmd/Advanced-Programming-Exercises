package Exercise3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalendarYear extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalendarYear frame = new CalendarYear();
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
	public CalendarYear() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Year");
		lblNewLabel.setBounds(10, 27, 77, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(79, 24, 121, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Generate Calendar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int year = Integer.parseInt(textField.getText());

				StringBuilder calendar = new StringBuilder();

				for (int m = 1; m <= 12; m++) {
				    java.time.YearMonth month =
				            java.time.YearMonth.of(year, m);

				    calendar.append("\n")
				            .append(month.getMonth())
				            .append(" ")
				            .append(year)
				            .append("\n");

				    calendar.append("Mon  Tue  Wed  Thu  Fri  Sat  Sun\n");

				    int firstDay = month.atDay(1).getDayOfWeek().getValue();

				    for (int i = 1; i < firstDay; i++) {
				        calendar.append(String.format("%-5s", ""));
				    }

				    for (int day = 1; day <= month.lengthOfMonth(); day++) {
				        calendar.append(String.format("%-5d", day));

				        if ((firstDay + day - 1) % 7 == 0) {
				            calendar.append("\n");
				        }
				    }

				    calendar.append("\n");
				}

				textArea.setText(calendar.toString());
			}
		});
		btnNewButton.setBounds(210, 23, 156, 23);
		contentPane.add(btnNewButton);
		textArea = new JTextArea();
		textArea.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 12));
		javax.swing.JScrollPane scrollPane =
		        new javax.swing.JScrollPane(textArea);

		scrollPane.setBounds(10, 52, 414, 198);
		contentPane.add(scrollPane);

	}
}
