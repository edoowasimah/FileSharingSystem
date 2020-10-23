import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 384, 22);
		contentPane.add(menuBar);
		
		JMenu upload = new JMenu("UPLOAD");
		menuBar.add(upload);
		
		JMenu userDetails = new JMenu("User Details");
		menuBar.add(userDetails);
		
		JMenu Logout = new JMenu("Log Out");
		menuBar.add(Logout);
	
		JMenuItem Logoutlink = new JMenuItem("Log Out");
		Logout.add(Logoutlink);
		Logoutlink.addActionListener(new ActionListener()  {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Loginpage login = new Loginpage();
				login.setVisible(true);
				dispose();
			}
		});
		
		
		Label label = new Label("WELCOME");
		label.setFont(new Font("Dialog", Font.BOLD, 18));
		label.setBackground(new Color(204, 51, 0));
		label.setAlignment(Label.CENTER);
		label.setBounds(0, 21, 384, 40);
		contentPane.add(label);
		
		Label label_1 = new Label("Search for file");
		label_1.setFont(new Font("Dialog", Font.BOLD, 13));
		label_1.setBounds(48, 93, 144, 22);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(58, 121, 269, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Button button = new Button("DOWNLOAD");
		button.setFont(new Font("Dialog", Font.BOLD, 13));
		button.setBackground(new Color(255, 255, 153));
		button.setBounds(139, 257, 105, 31);
		contentPane.add(button);
		
	}
}
