package com.db;

import java.sql.Connection;
import java.sql.Statement;

public class delete_approved_note {
	
	private static Connection con = null;
	private static Statement statment = null;

	public static void deleteUser(int idsupplier) {
		try {
			con = com.db.DatabaseConnection.getConnection();
			statment = con.createStatement();
			String sql = "DELETE FROM approve_note WHERE idsupplier='" + idsupplier + "'";
			statment.executeUpdate(sql);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteUser2(int idsupplier) {
		try {
			con = com.db.DatabaseConnection.getConnection();
			statment = con.createStatement();
			String sql = "DELETE FROM rejected_note WHERE idsupplier='" + idsupplier + "'";
			statment.executeUpdate(sql);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
