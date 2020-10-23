import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Upload {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Upload window = new Upload();
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
	public Upload() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 264);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(136, 69, 243, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		Label label = new Label("Choose a File ");
		label.setFont(new Font("Dialog", Font.BOLD, 14));
		label.setBounds(22, 67, 108, 22);
		frame.getContentPane().add(label);
		
		Button button = new Button("Attach");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser= new JFileChooser();
				chooser.showOpenDialog(null);
				File f = chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				textField.setText(filename);
			}
		});
		button.setBounds(271, 102, 108, 32);
		frame.getContentPane().add(button);
		
		Button button_1 = new Button("Cancel");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home page =new Home();
				page.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(94, 182, 93, 32);
		frame.getContentPane().add(button_1);
		
		Button button_2 = new Button("Upload");
		button_2.setBounds(214, 182, 99, 32);
		frame.getContentPane().add(button_2);
	}

	protected void dispose() {
		// TODO Auto-generated method stub
		
	}
}
