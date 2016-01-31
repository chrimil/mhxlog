package pack1;
import java.sql.*;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import pack1.Driver;
public class ShowTableTmimata {
	public static void showTm(JTable table){
		Connection conn = null;
		String query = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		String[] tableColumnsName = {"My Columns1","My Columns2","My Columns3"};
		DefaultTableModel aModel = (DefaultTableModel) table.getModel();
		aModel.setColumnIdentifiers(tableColumnsName);

		try {
			conn = Driver.Drv();
			query = "select * from tmimata";
			statement = conn.prepareStatement(query);
			rs = statement.executeQuery();

			ResultSetMetaData meta = rs.getMetaData();
			int colNo = meta.getColumnCount();

			while (rs.next()) {
				Object[] objects = new Object[colNo];
				for (int i = 0; i < colNo; i++) {
					objects[i] = rs.getObject(i + 1);
				}
				aModel.addRow(objects);
			}

			table.setModel(aModel);
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
		
	}
	}

