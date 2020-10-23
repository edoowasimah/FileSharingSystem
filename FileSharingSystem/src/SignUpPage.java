import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Label;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUpPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpPage frame = new SignUpPage();
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
	public SignUpPage() {
		setBackground(new Color(255, 255, 102));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("SIGN UP");
		label.setFont(new Font("Consolas", Font.BOLD, 18));
		label.setAlignment(Label.CENTER);
		label.setBackground(new Color(204, 51, 0));
		label.setBounds(0, 0, 384, 41);
		contentPane.add(label);
		
		Label label_1 = new Label("Username");
		label_1.setFont(new Font("Consolas", Font.PLAIN, 14));
		label_1.setAlignment(Label.CENTER);
		label_1.setBounds(29, 59, 101, 22);
		contentPane.add(label_1);
		
		Label label_2 = new Label("Email");
		label_2.setFont(new Font("Consolas", Font.PLAIN, 14));
		label_2.setBounds(44, 102, 86, 22);
		contentPane.add(label_2);
		
		Button button = new Button("REGISTER");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home page =new Home();
				page.setVisible(true);
				dispose();	
			}
		});
		button.setBackground(new Color(255, 255, 153));
		button.setBounds(82, 296, 94, 30);
		contentPane.add(button);
		
		Button button_1 = new Button("EXIT");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loginpage login=new Loginpage();
				login.setVisible(true);
				dispose();
			}
		});
		button_1.setBackground(new Color(255, 255, 153));
		button_1.setBounds(215, 296, 70, 30);
		contentPane.add(button_1);
		
		Label label_4 = new Label("Create Password");
		label_4.setFont(new Font("Consolas", Font.PLAIN, 14));
		label_4.setBounds(44, 149, 122, 22);
		contentPane.add(label_4);
		
		Label label_5 = new Label("Job");
		label_5.setFont(new Font("Consolas", Font.PLAIN, 14));
		label_5.setBounds(44, 237, 62, 30);
		contentPane.add(label_5);
		
		Checkbox checkbox = new Checkbox("Student");
		checkbox.setFont(new Font("Dialog", Font.PLAIN, 13));
		checkbox.setBounds(133, 237, 76, 30);
		contentPane.add(checkbox);
		
		Checkbox checkbox_1 = new Checkbox("Teacher");
		checkbox_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		checkbox_1.setBounds(228, 237, 108, 30);
		contentPane.add(checkbox_1);
		
		Label label_3 = new Label("Confirm password");
		label_3.setFont(new Font("Consolas", Font.PLAIN, 14));
		label_3.setBounds(44, 195, 122, 22);
		contentPane.add(label_3);
		
		textField = new JTextField();
		textField.setBounds(136, 61, 212, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 112, 212, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(172, 151, 176, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(172, 197, 176, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}

}
