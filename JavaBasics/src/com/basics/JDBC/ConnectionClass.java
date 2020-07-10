package com.basics.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	Connection connection = null;
	public Connection getConnection() {
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		}
		catch (ClassNotFoundException | SQLException e){
			System.out.println("Error getting connection "+ e);
		}
		return connection;
	}
	public void  closeConnection() {
		try{connection.close();}
		catch (SQLException e){
			System.out.println("Error closing connection "+e);
		}
	}
}
