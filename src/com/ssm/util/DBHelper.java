package com.ssm.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {
	public static Connection getConnection() throws Exception {
		// step1 load the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// step2 create the connection object
		// url:1521:sid,username,password
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:oracle1", "SYSTEM",
				"System001");
		return con;
	}

}
