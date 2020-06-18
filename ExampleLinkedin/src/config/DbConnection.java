package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	   private static String USERNAME="user";
	    private static String CONTRASENA="123";
	    private static final String URL="jdbc:mysql://localhost:3306/linkedin?useTimezone=true&serverTimezone=UTC";
	
	    
	    public static Connection getConnection() {
	    
	    Connection con=null;
	    
	    try {

			// load the driver class
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("MySQL JDBC Driver Registered!");

			// get hold of the DriverManager
			con = DriverManager.getConnection(URL,USERNAME,CONTRASENA);
			
		} catch (ClassNotFoundException e1) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e1.printStackTrace();

		}

		catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();

		}

		if (con != null) {
			System.out.println("Connection made to DB!");
		}
		return con;
	}

	    
}
	

