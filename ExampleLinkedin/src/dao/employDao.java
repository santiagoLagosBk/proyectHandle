package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.employ;
import config.DbConnection;

public class employDao {

	
	
	public Boolean validar(employ em) {
		//creation elements needs to the connection to database
		Connection con;
		PreparedStatement ps;
		//sql validar
		
		boolean ref=false;
		try {
			con=DbConnection.getConnection();
			//write validar sql
			String validarSQL="select * from usuario where user=? and password=?";
			ps=con.prepareStatement(validarSQL);
			ps.setString(1, em.getUserName());
			ps.setString(2, em.getPassword());
			ResultSet rs;
			rs=ps.executeQuery();
			while(rs.next()) {
				ref=true;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ref;
	}
	
	
}
