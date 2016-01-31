package pack1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class HR extends JFrame {

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
					HR frame = new HR();
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
	public HR() {
		
		setBounds(100, 100, 490, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHrsManagement = new JLabel("HR's MANAGEMENT");
		lblHrsManagement.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblHrsManagement.setBounds(12, 13, 319, 36);
		contentPane.add(lblHrsManagement);
		
		JLabel lblInsert = new JLabel("Insert Department's Name");
		lblInsert.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblInsert.setBounds(0, 53, 196, 19);
		contentPane.add(lblInsert);
		
		textField = new JTextField();
		textField.setBounds(0, 85, 205, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblInsertWorkersName = new JLabel("Insert Worker's Name");
		lblInsertWorkersName.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblInsertWorkersName.setBounds(0, 120, 231, 16);
		contentPane.add(lblInsertWorkersName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(0, 149, 205, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAvailableOptions = new JLabel("Available Options:");
		lblAvailableOptions.setBounds(160, 213, 241, 16);
		contentPane.add(lblAvailableOptions);
		
		JLabel lblWorker = new JLabel("Worker");
		lblWorker.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWorker.setBounds(12, 228, 56, 16);
		contentPane.add(lblWorker);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDepartment.setBounds(12, 279, 96, 16);
		contentPane.add(lblDepartment);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String worker=textField_1.getText();
				Connection conn = null;
				String query = null;
				PreparedStatement statement = null;

				conn = Driver.Drv();
				
				try {
				query = "insert into ergazomenoi (name) values (?)";
				statement = conn.prepareStatement(query);
				statement.setString(1,worker);
				statement.execute();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAdd.setBounds(11, 246, 97, 25);
		contentPane.add(btnAdd);
		
		JButton btnAdd_1 = new JButton("Add");
		btnAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String department=textField.getText();
				Connection conn = null;
				String query = null;
				PreparedStatement statement = null;

				conn = Driver.Drv();
				
				try {
				query = "insert into tmimata (name) values (?)";
				statement = conn.prepareStatement(query);
				statement.setString(1,department);
				statement.execute();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAdd_1.setBounds(12, 297, 97, 25);
		contentPane.add(btnAdd_1);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String worker=textField_1.getText();
				String workerNew=textField_3.getText();
				Connection conn = null;
				String query = null;
				PreparedStatement statement = null;

				conn = Driver.Drv();
				
				try {//
				query = "UPDATE ergazomenoi SET name=? WHERE name = ?";
				statement = conn.prepareStatement(query);
				statement.setString(1,workerNew);
				statement.setString(2,worker);
				statement.execute();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnUpdate.setBounds(121, 246, 97, 25);
		contentPane.add(btnUpdate);
		
		JButton btnUpdate_1 = new JButton("Update");
		btnUpdate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String departm=textField_1.getText();
				String departmNew=textField_3.getText();
				Connection conn = null;
				String query = null;
				PreparedStatement statement = null;

				conn = Driver.Drv();
				
				try {//
				query = "UPDATE tmimata SET name=? WHERE name = ?";
				statement = conn.prepareStatement(query);
				statement.setString(1,departmNew);
				statement.setString(2,departm);
				statement.execute();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnUpdate_1.setBounds(121, 297, 97, 25);
		contentPane.add(btnUpdate_1);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String worker=textField_1.getText();
				Connection conn = null;
				String query = null;
				PreparedStatement statement = null;

				conn = Driver.Drv();
				
				try {//
				query = "DELETE FROM ergazomenoi WHERE name=?";
				statement = conn.prepareStatement(query);
				statement.setString(1,worker);
				statement.execute();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnDelete.setBounds(230, 246, 97, 25);
		contentPane.add(btnDelete);
		
		JButton btnDelete_1 = new JButton("Delete");
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String departm=textField_1.getText();
				Connection conn = null;
				String query = null;
				PreparedStatement statement = null;

				conn = Driver.Drv();
				
				try {//
				query = "DELETE FROM tmimata WHERE name=?";
				statement = conn.prepareStatement(query);
				statement.setString(1,departm);
				statement.execute();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnDelete_1.setBounds(230, 297, 97, 25);
		contentPane.add(btnDelete_1);
		
		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ShowWorkerList frame1 = new ShowWorkerList();
				frame1.setVisible(true);
			}
		});
		btnShow.setBounds(334, 246, 97, 25);
		contentPane.add(btnShow);
		
		JButton btnShow_1 = new JButton("Show");
		btnShow_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ShowDepartmentList frame1 = new ShowDepartmentList();
				frame1.setVisible(true);
			}
		});
		btnShow_1.setBounds(334, 297, 97, 25);
		contentPane.add(btnShow_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainGui frame1 = new MainGui();
				frame1.setVisible(true);
			}
		});
		btnBack.setBounds(363, 13, 97, 25);
		contentPane.add(btnBack);
		
		JLabel lblNewDepartmentsName = new JLabel("New Department's Name");
		lblNewDepartmentsName.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewDepartmentsName.setBounds(225, 53, 196, 19);
		contentPane.add(lblNewDepartmentsName);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(225, 85, 205, 22);
		contentPane.add(textField_2);
		
		JLabel lblNewWorkersName = new JLabel("New Worker's Name");
		lblNewWorkersName.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblNewWorkersName.setBounds(225, 121, 231, 16);
		contentPane.add(lblNewWorkersName);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(226, 149, 205, 22);
		contentPane.add(textField_3);
		
		JLabel lblInCaseYou = new JLabel("(In case you need to update , fill in both the name you wish to update \r\n");
		lblInCaseYou.setBounds(12, 167, 491, 22);
		contentPane.add(lblInCaseYou);
		
		JLabel lblAndAlsoThe = new JLabel("and also the new name)");
		lblAndAlsoThe.setBounds(12, 184, 163, 16);
		contentPane.add(lblAndAlsoThe);
	}
}
