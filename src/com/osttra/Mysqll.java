package com.osttra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Mysqll {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/osttra_jdbc", "root", "root");
		
		Statement statement = conn.createStatement();
		
		statement.executeUpdate("insert into user values('bcd', '2345', 'Khush')");
	}

}
