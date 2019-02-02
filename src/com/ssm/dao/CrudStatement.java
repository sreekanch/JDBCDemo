package com.ssm.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CrudStatement {

	public void createEmpDetails(Connection con) throws Exception {
		Statement stmt = con.createStatement();
		try {
			String sql = "insert into emp values (100, 'Treebeard', 'CO', NULL, NULL, NULL, NULL, NULL)";

			int count = stmt.executeUpdate(sql);
			stmt.close();
		} catch (Throwable t) {
			System.out.println("error t " + t);
		} finally {
			try {
				stmt.close();
			} catch (Exception e) { /* ignored */
			}
		}
	}

	public void readEmpDetails(Connection con) throws Exception {
		Statement stmt = con.createStatement();
		// step4 execute query
		ResultSet rs = stmt.executeQuery("select * from emp");
		while (rs.next())
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "
					+ rs.getString(3));
		stmt.close();
	}

	public void updateEmpDetails(Connection con) throws Exception {
		Statement stmt = con.createStatement();
		String sql = "update emp set sal = 10000 where empno=100";
		int count = stmt.executeUpdate(sql);
		stmt.close();
	}

	public void deleteEmpDetails(Connection con) throws Exception {
		Statement stmt = con.createStatement();
		String sql = "delete from emp where empno=100";
		int count = stmt.executeUpdate(sql);
		stmt.close();

	}

}
