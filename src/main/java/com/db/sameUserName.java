package com.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class sameUserName {

	private static Connection con = null;
	private static Statement statment = null;
	private static ResultSet rs = null;
	public static String SetUserName;

	public static boolean userVerification(String logUname) {
		boolean isSuccess = false;

		try {
			con = DatabaseConnection.getConnection();
			statment = con.createStatement();
			String sql = "select * from user_register where user_name='" + logUname 
					+ "'";
			rs = statment.executeQuery(sql);

			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}
}
