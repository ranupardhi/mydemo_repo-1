package com.tcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectExample {

	public static void main(String[] args) throws Exception {
		// Step 1 : Loading & Registering the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Driver d =
		// Step 2 : Establishing the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcs1", "root", "droot");

		// Step 3 : Create & Execute Query
		String query = "select * from employee";
		Statement stmt = conn.createStatement();

		// Step 4 : Storing & Processing Result
		ResultSet rs = stmt.executeQuery(query);

		System.out.println("id \t Name \t Email ");
		while (rs.next()) {
			System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" + rs.getString(3));
		}

		// Step 5 : closing all Reource
		if (rs != null)
			rs.close();
		if (stmt != null)
			stmt.close();
		if (conn != null)
			conn.close();
	}

}
