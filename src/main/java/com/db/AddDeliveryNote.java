package com.db;

import java.sql.Connection;
import java.sql.Statement;

public class AddDeliveryNote {
	private static Connection con = null;
	private static Statement statment = null;

	public static boolean addNote(String  productId,String  description,int quantity,double price, String  date, String location) {
		
		boolean isSuccess = false;
		
		try {

			con = DatabaseConnection.getConnection();
			statment = con.createStatement();
			String sql = "INSERT INTO supplier (productId, description, quantity, price, date,location) VALUES ('"
					+ productId + "', '" + description + "', '" + quantity + "', '" + price + "', '"
					+ date + "','" + location +  "')";

			statment.executeUpdate(sql);
			isSuccess = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
}
}
