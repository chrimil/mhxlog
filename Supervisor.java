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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Supervisor extends JFrame {

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
					Supervisor frame = new Supervisor();
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
	public Supervisor() {
		
		setBounds(100, 100, 484, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSupervisorsManagement = new JLabel("SUPERVISOR'S MANAGEMENT");
		lblSupervisorsManagement.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblSupervisorsManagement.setBounds(0, 0, 375, 36);
		contentPane.add(lblSupervisorsManagement);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainGui frame1 = new MainGui();
				frame1.setVisible(true);
			}
		});
		button.setBounds(390, 14, 64, 19);
		contentPane.add(button);
		
		JLabel label = new JLabel("Insert Department's Name");
		label.setFont(new Font("Tahoma", Font.ITALIC, 15));
		label.setBounds(10, 41, 196, 19);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(30, 62, 196, 22);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("Insert Worker's Name");
		label_1.setFont(new Font("Tahoma", Font.ITALIC, 16));
		label_1.setBounds(12, 90, 231, 16);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(30, 110, 196, 22);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("Available Options:");
		label_2.setBounds(30, 145, 241, 16);
		contentPane.add(label_2);
		
		JLabel lblWorkersAssessment = new JLabel("Worker's Assessment");
		lblWorkersAssessment.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWorkersAssessment.setBounds(30, 163, 159, 16);
		contentPane.add(lblWorkersAssessment);
		
		JLabel lblDepartmentsAssessment = new JLabel("Department's Assessment");
		lblDepartmentsAssessment.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDepartmentsAssessment.setBounds(30, 207, 213, 16);
		contentPane.add(lblDepartmentsAssessment);
		
		JButton btnWorkersAssessment = new JButton("Create");
		btnWorkersAssessment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String worker=textField_1.getText();
				String assess=textField_3.getText();
				Connection conn = null;
				String query = null;
				PreparedStatement statement = null;

				conn = Driver.Drv();
				
				try {
				query = "update ergazomenoi set rating=? where name=?";
				statement = conn.prepareStatement(query);
				statement.setString(1,assess);
				statement.setString(2,worker);
				statement.execute();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnWorkersAssessment.setBounds(29, 180, 95, 25);
		contentPane.add(btnWorkersAssessment);
		
		JButton btnDepartmentsAssessment = new JButton("Delete");
		btnDepartmentsAssessment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String worker=textField_1.getText();
				Connection conn = null;
				String query = null;
				PreparedStatement statement = null;

				conn = Driver.Drv();
				
				try {
				query = "update ergazomenoi set rating=null where name=?";
				statement = conn.prepareStatement(query);
				statement.setString(1,worker);
				statement.execute();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnDepartmentsAssessment.setBounds(240, 180, 95, 25);
		contentPane.add(btnDepartmentsAssessment);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String worker=textField_1.getText();
				String assess=textField_3.getText();
				Connection conn = null;
				String query = null;
				PreparedStatement statement = null;

				conn = Driver.Drv();
				
				try {
				query = "update ergazomenoi set rating=? where name=?";
				statement = conn.prepareStatement(query);
				statement.setString(1,assess);
				statement.setString(2,worker);
				statement.execute();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				
			}
		});
		btnUpdate.setBounds(136, 180, 95, 25);
		contentPane.add(btnUpdate);
		
		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ShowWorkerList frame1 = new ShowWorkerList();
				frame1.setVisible(true);
			}
		});
		btnShow.setBounds(347, 180, 97, 25);
		contentPane.add(btnShow);
		
		JButton button_1 = new JButton("Create");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String departm=textField.getText();
				String assess=textField_2.getText();
				Connection conn = null;
				String query = null;
				PreparedStatement statement = null;

				conn = Driver.Drv();
				
				try {
				query = "update tmimata set rating=? where name=?";
				statement = conn.prepareStatement(query);
				statement.setString(1,assess);
				statement.setString(2,departm);
				statement.execute();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_1.setBounds(30, 225, 95, 25);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Update");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String departm=textField.getText();
				String assess=textField_2.getText();
				Connection conn = null;
				String query = null;
				PreparedStatement statement = null;

				conn = Driver.Drv();
				
				try {
				query = "update tmimata set rating=? where name=?";
				statement = conn.prepareStatement(query);
				statement.setString(1,assess);
				statement.setString(2,departm);
				statement.execute();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		button_2.setBounds(136, 225, 95, 25);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Delete");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String departm=textField.getText();
				Connection conn = null;
				String query = null;
				PreparedStatement statement = null;

				conn = Driver.Drv();
				
				try {
				query = "update tmimata set rating=null where name=?";
				statement = conn.prepareStatement(query);
				statement.setString(1,departm);
				statement.execute();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_3.setBounds(240, 225, 95, 25);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Show");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ShowDepartmentList frame1 = new ShowDepartmentList();
				frame1.setVisible(true);
			}
		});
		button_4.setBounds(347, 225, 97, 25);
		contentPane.add(button_4);
		
		JLabel lblDepartmentsAssessment_1 = new JLabel("Department's Assessment");
		lblDepartmentsAssessment_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblDepartmentsAssessment_1.setBounds(236, 41, 196, 19);
		contentPane.add(lblDepartmentsAssessment_1);
		
		JLabel lblWorkersAssessment_1 = new JLabel("Worker's Assessment");
		lblWorkersAssessment_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblWorkersAssessment_1.setBounds(236, 91, 196, 19);
		contentPane.add(lblWorkersAssessment_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(238, 62, 32, 22);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(238, 110, 32, 22);
		contentPane.add(textField_3);
		
		JLabel label_3 = new JLabel("/10");
		label_3.setBounds(279, 65, 56, 16);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("/10");
		label_4.setBounds(279, 113, 56, 16);
		contentPane.add(label_4);
	}

}
