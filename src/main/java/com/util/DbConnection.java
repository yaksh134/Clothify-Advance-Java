package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection getConnection() {
		String driver ="org.postgresql.Driver";
		
		String url = "jdbc:postgresql://localhost:5432/clothify";
		String username = "postgres";
		String password = "root";
		
		Connection con = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,username,password);
			if(con == null) {
				System.out.println("Database not connected");
			}else {
				System.out.println("database connected");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public static void main(String[] args) {
		getConnection();
	}
}
