import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JTextPane;
import java.awt.Button;

public class Info {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Info window = new Info();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Info() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 102));
		frame.setBounds(100, 100, 400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("User Information");
		label.setFont(new Font("Dialog", Font.BOLD, 18));
		label.setAlignment(Label.CENTER);
		label.setBackground(new Color(204, 51, 0));
		label.setBounds(0, 0, 386, 59);
		frame.getContentPane().add(label);
		
		Label UidLab = new Label("User ID");
		UidLab.setFont(new Font("Tahoma", Font.PLAIN, 13));
		UidLab.setBounds(21, 89, 113, 33);
		frame.getContentPane().add(UidLab);
		
		Label unamelab = new Label("Username");
		unamelab.setFont(new Font("Tahoma", Font.PLAIN, 13));
		unamelab.setBounds(21, 167, 113, 38);
		frame.getContentPane().add(unamelab);
		
		Label eaddresslab = new Label("Email Address");
		eaddresslab.setFont(new Font("Tahoma", Font.PLAIN, 13));
		eaddresslab.setBounds(21, 246, 113, 27);
		frame.getContentPane().add(eaddresslab);
		
		Button nextBtn = new Button("Next");
		nextBtn.setBackground(new Color(255, 255, 153));
		nextBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		nextBtn.setBounds(263, 320, 113, 33);
		frame.getContentPane().add(nextBtn);
		
		Label uidout = new Label("");
		uidout.setBackground(Color.WHITE);
		uidout.setBounds(152, 89, 224, 33);
		frame.getContentPane().add(uidout);
		
		Label unameout = new Label("");
		unameout.setBackground(Color.WHITE);
		unameout.setBounds(152, 172, 224, 33);
		frame.getContentPane().add(unameout);
		
		Label label_1 = new Label("");
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(152, 246, 224, 33);
		frame.getContentPane().add(label_1);
	}
}
