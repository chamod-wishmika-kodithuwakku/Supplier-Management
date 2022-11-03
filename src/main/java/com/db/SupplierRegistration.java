package com.db;

import java.sql.Connection;
import java.sql.Statement;

public class SupplierRegistration {

	private static Connection con = null;
	private static Statement statment = null;

	public static boolean supplierReg(String user_name, String password, String email) {

		boolean isSuccess = true;

		try {

			con = DatabaseConnection.getConnection();
			statment = con.createStatement();
			String sql = "INSERT INTO supplierregister (user_name, password, email) VALUES ('" + user_name + "', '"
					+ password + "', '" + email + "')";

			statment.executeUpdate(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
}
