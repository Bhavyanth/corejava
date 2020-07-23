package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysql {
	
	public static Connection getConnection() {
		Connection con =null;
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			 con=DriverManager.getConnection(  
			"jdbc:mysql://35.232.124.236:3306/practice?characterEncoding=latin1","root","Tiger9959");  
			//here sonoo is database name, root is username and password  
			
			}catch(Exception e){ System.out.println(e);}  
		return con;
		} 
	
	public static void createTable() {
		Connection con=getConnection();  
		String sql = "CREATE TABLE REGISTRATION " +
                "(id INTEGER not NULL, " +
                " first VARCHAR(255), " + 
                " last VARCHAR(255), " + 
                " age INTEGER, " + 
                " PRIMARY KEY ( id ))"; 

		Statement stmt;
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
	
	public static void select() {
		  
				try{  
				Connection con=getConnection();  
				//here sonoo is database name, root is username and password  
				Statement stmt=con.createStatement();  
				ResultSet rs=stmt.executeQuery("select * from authors");  
				while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
				con.close();  
				}catch(Exception e){ System.out.println(e);}  
				
		
	}

	
	public static void main(String args[]){
		
		createTable();
	}  
}
