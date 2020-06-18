package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import java.util.List;

import beans.User;
import config.DbConnection;

public class AplicationDao {
	
	
	
	
	public int registerUser(User user) {
		 int rowsAffected=0;

			Connection con;
		if(serch(user)==true) {
			
			rowsAffected=0;
			
		}else{
		
			try {
				// get the connection for the database
				con=DbConnection.getConnection();
				// Write the insert query
				String insertQuery="insert into usuario values(?,?,?,?,?)";
				//set parameters with PreparedStatement
				PreparedStatement ps;
				ps=con.prepareStatement(insertQuery);
				ps.setString(1, null);
				ps.setString(2, user.getUserName());
				ps.setString(3, user.getPassword());
				ps.setString(4, user.getFisrtName());
				ps.setString(5, user.getLastName());
				
				rowsAffected=ps.executeUpdate();
				
				
			}catch (SQLException exception) {
				
				exception.printStackTrace();
			}
		}
		
		return rowsAffected;
		
	}
	
	
	private Boolean serch(User user) {
		
		boolean ref=false;
		Connection con;

		try {
			//get again connection for the database
		
		con=DbConnection.getConnection();
		//write the select query
		PreparedStatement ps;
		 String selectQuery="select * from usuario where user=?";
		 ps=con.prepareStatement(selectQuery);
		 ps.setString(1, user.getUserName());
		 
		 ResultSet rs;
		 rs=ps.executeQuery();
		 	
		 	while(rs.next()){
		 		ref=true;
		 	}
		 
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return ref;
		
	}
	
	
	public List<User> serchUser(String searchString){
		
		 List<User> usersList=new ArrayList<User>();
		 
		
		
		 try {
			 Connection con=DbConnection.getConnection();
			 String serchQuery="select * from usuario where user=?";
			 PreparedStatement ps;
			ps=con.prepareStatement(serchQuery);
			ps.setString(1, searchString);
			ResultSet rs;
			rs=ps.executeQuery();
			while(rs.next()) {
				User user1=new User();
				user1.setFisrtName(rs.getString("first_name"));
				user1.setLastName(rs.getString("last_name"));
				user1.setUserName(rs.getString("user"));
				usersList.add(user1);
			}
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return usersList;
	}
	
	

}
