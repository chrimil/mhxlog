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

public class ShowDepartmentList extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowDepartmentList frame = new ShowDepartmentList();
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
	public ShowDepartmentList() {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDepartmentsList = new JLabel("Department's List");
		lblDepartmentsList.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblDepartmentsList.setBounds(12, 13, 245, 36);
		contentPane.add(lblDepartmentsList);
		
		JButton btnBackToHr = new JButton("Back to HR");
		btnBackToHr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HR frame1 = new HR();
				frame1.setVisible(true);
			}
		});
		btnBackToHr.setBounds(323, 13, 97, 25);
		contentPane.add(btnBackToHr);
		
		JButton button = new JButton("Back to \r\nSupervisor");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Supervisor frame1 = new Supervisor();
				frame1.setVisible(true);
			}
		});
		button.setBounds(281, 45, 139, 25);
		contentPane.add(button);
		
		table = new JTable();
		table.setBounds(12, 83, 408, 159);
		contentPane.add(table);
		ShowTableTmimata.showTm(table);
	}

}
