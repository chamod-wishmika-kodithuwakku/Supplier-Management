package com.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.deletedUser;
import com.model.viewPendingNotes;

public class viewPendingDeliveryNotes {
	
	private static Connection con = null;
	private static Statement statment = null;
	private static ResultSet rs = null;
	
	public static List<viewPendingNotes> userDetails() {
		ArrayList<viewPendingNotes> userArray = new ArrayList<viewPendingNotes>();
		

		try {
			con = DatabaseConnection.getConnection();
			statment = con.createStatement();
			String sql = "select * from supplier";
			rs = statment.executeQuery(sql);

			while (rs.next()) {
				int idsupplier = rs.getInt(1);
				String productId = rs.getString(2);
				String description = rs.getString(3);
				int quantity = rs.getInt(4);
				double price = rs.getDouble(5);
				String date = rs.getString(6);
				String location = rs.getString(7);

				viewPendingNotes u = new com.model.viewPendingNotes(idsupplier, productId, description, quantity, price, date, location);
				userArray.add(u);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return userArray;
	}
}
