package pack1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class MainGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGui frame = new MainGui();
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
	public MainGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0394\u03B9\u03B1\u03C7\u03B5\u03AF\u03C1\u03B9\u03C3\u03B7 \u03A0\u03C1\u03BF\u03C3\u03C9\u03C0\u03B9\u03BA\u03BF\u03CD");
		label.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 25));
		label.setBounds(12, 13, 353, 78);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("HR");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HR frame1 = new HR();
				frame1.setVisible(true);
			}
		});
		btnNewButton.setBounds(52, 104, 313, 64);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Supervisor");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Supervisor frame1 = new Supervisor();
				frame1.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(52, 202, 313, 69);
		contentPane.add(btnNewButton_1);
	}
}
