package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Driver {
	static Connection Conn=null;
	public static Connection Drv(){
		try {
			 Conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bash","root","test123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Conn;
	}
}
