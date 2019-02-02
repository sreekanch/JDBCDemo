package com.ssm;

import java.sql.Connection;

import com.ssm.dao.CrudPrepStatement;
import com.ssm.dao.CrudStatement;
import com.ssm.util.DBHelper;

public class HelloDB {
	CrudStatement cs = new CrudStatement();
	CrudPrepStatement cps = new CrudPrepStatement();

	private void crudStatementOperations(Connection con) throws Exception {

		cs.createEmpDetails(con);
		cs.readEmpDetails(con);
		cs.updateEmpDetails(con);
		cs.deleteEmpDetails(con);
	}

	private void crudPrepStatementOperations(Connection con) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) throws Exception {
		HelloDB helloDB = new HelloDB();
		Connection con = DBHelper.getConnection();
		helloDB.crudStatementOperations(con);
		helloDB.crudPrepStatementOperations(con);
		// TODO Auto-generated method stub
		try {
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
