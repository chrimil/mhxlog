public class ShowWorkerList extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowWorkerList frame = new ShowWorkerList();
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
	public ShowWorkerList() {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWorkersList = new JLabel("Worker's List");
		lblWorkersList.setBounds(12, 13, 214, 36);
		lblWorkersList.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		contentPane.add(lblWorkersList);
		
		JButton btnBackToHr = new JButton("Back to HR");
		btnBackToHr.setBounds(323, 13, 97, 25);
		btnBackToHr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HR frame1 = new HR();
				frame1.setVisible(true);
			}
		});
		contentPane.add(btnBackToHr);
		
		JButton btnBackToSupervisor = new JButton("Back to \r\nSupervisor");
		btnBackToSupervisor.setBounds(281, 41, 139, 25);
		btnBackToSupervisor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Supervisor frame1 = new Supervisor();
				frame1.setVisible(true);
			}
		});
		contentPane.add(btnBackToSupervisor);
		
		table = new JTable();
		table.setBounds(12, 77, 408, 165);
		contentPane.add(table);
		ShowTable.showT(table);
	}
}
