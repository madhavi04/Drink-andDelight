package com.capgemini.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoginDB {
	public static Connection getConnection1() throws SQLException, ClassNotFoundException
	{
		String drivername="oracle.jdbc.driver.OracleDriver";
		Class.forName(drivername);
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","madhavi","madhu");
				return con;
	}
}
