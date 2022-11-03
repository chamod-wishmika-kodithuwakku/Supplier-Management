package com.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.ApproveNote;
import com.model.RejectNote;

public class view_Rejected_Notes {

	private static Connection con = null;
	private static Statement statment = null;
	private static ResultSet rs = null;
	
	public static List<RejectNote> userDetails() {
		ArrayList<RejectNote> array = new ArrayList<RejectNote>();
		

		try {
			con = DatabaseConnection.getConnection();
			statment = con.createStatement();
			String sql = "select * from rejected_note";
			rs = statment.executeQuery(sql);

			while (rs.next()) {
				int idsupplier = rs.getInt(1);
				String productId = rs.getString(2);
				String description = rs.getString(3);
				String quantity = rs.getString(4);
				String price = rs.getString(5);
				String date = rs.getString(6);
				String location = rs.getString(7);

				com.model.RejectNote a = new com.model.RejectNote(idsupplier, productId, description, quantity, price, date, location);
				array.add(a);
				
				System.out.print(description);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return array;
	}
}
