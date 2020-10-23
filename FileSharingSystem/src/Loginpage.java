import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Loginpage extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginpage frame = new Loginpage();
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
	public Loginpage() {
		setBackground(new Color(255, 255, 102));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("LOGIN");
		label.setAlignment(Label.CENTER);
		label.setFont(new Font("Dialog", Font.BOLD, 18));
		label.setBackground(new Color(204, 51, 0));
		label.setBounds(0, 0, 384, 48);
		contentPane.add(label);
		
		Label label_1 = new Label("WELCOME");
		label_1.setFont(new Font("Dialog", Font.BOLD, 18));
		label_1.setAlignment(Label.CENTER);
		label_1.setBounds(0, 64, 384, 38);
		contentPane.add(label_1);
		
		Label label_2 = new Label("Username/Email");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_2.setBounds(27, 141, 110, 22);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(143, 136, 178, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(143, 185, 178, 27);
		contentPane.add(passwordField);
		
		Label label_3 = new Label("Password");
		label_3.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_3.setBounds(27, 185, 110, 22);
		contentPane.add(label_3);
		
		Label label_4 = new Label("Not yet a member? Then Sign Up here");
		label_4.setForeground(new Color(165, 42, 42));
		label_4.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_4.setBounds(10, 287, 194, 22);
		contentPane.add(label_4);
				
		Button button = new Button("LOGIN");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home page =new Home();
				page.setVisible(true);
				dispose();				
			}
		});
		
		button.setFont(new Font("Dialog", Font.BOLD, 14));
		button.setBackground(new Color(255, 255, 153));
		button.setBounds(208, 230, 89, 38);
		contentPane.add(button);
		
		Button button_1 = new Button("SIGN UP");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUpPage signup =new SignUpPage();
				signup.setVisible(true);
				dispose();	
			}
		});
		button_1.setFont(new Font("Dialog", Font.BOLD, 14));
		button_1.setBackground(new Color(255, 255, 153));
		button_1.setBounds(208, 287, 89, 33);
		contentPane.add(button_1);
		
		
		
	}
}
