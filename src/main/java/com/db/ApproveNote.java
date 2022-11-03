package com.db;

import java.sql.Connection;
import java.sql.Statement;

public class ApproveNote {

	private static Connection con = null;
	private static Statement statment = null;
	private static Statement statment1 = null;
	private static Statement statment2 = null;
	
	public static void addToApproveNoteTable(String productId, String description, String quantity, String price, String date,
			String location) {
		try {
			con = DatabaseConnection.getConnection();
			statment1 = con.createStatement();
			String sql = "INSERT INTO approve_note (productId, description, quantity, price, date, location) VALUES ('" + productId
					+ "', '" + description + "','" + quantity + "','" + price + "','" + date + "','" + location + "');";
			statment1.executeUpdate(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void addToRejectNoteTable(String productId, String description, String quantity, String price, String date,
			String location) {
		try {
			con = DatabaseConnection.getConnection();
			statment1 = con.createStatement();
			String sql = "INSERT INTO rejected_note (productId, description, quantity, price, date, location) VALUES ('" + productId
					+ "', '" + description + "','" + quantity + "','" + price + "','" + date + "','" + location + "');";
			statment1.executeUpdate(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void deleteNote(int idsupplier) {
		try {
			con = com.db.DatabaseConnection.getConnection();
			statment = con.createStatement();
			String sql = "DELETE FROM supplier WHERE idsupplier='" + idsupplier + "'";
			statment.executeUpdate(sql);
			System.out.println(idsupplier);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
