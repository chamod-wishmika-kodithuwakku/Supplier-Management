package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ApproveNote")
public class ApproveNote extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idsupplier = Integer.parseInt(request.getParameter("idsupplier"));
		String productId =  request.getParameter("productId");
	String description = request.getParameter("description");
	String quantity = request.getParameter("quantity");
	String price =request.getParameter("price");
	String date =request.getParameter("date");
	String location = request.getParameter("location");
	
	
	if (request.getParameter("btn3") != null){
		
		com.db.ApproveNote.addToRejectNoteTable(productId, description, quantity, price, date, location);
		com.db.ApproveNote.deleteNote(idsupplier);
	 }
	
	else if (request.getParameter("btn2") != null){
		com.db.ApproveNote.addToApproveNoteTable(productId, description, quantity, price, date, location);
		com.db.ApproveNote.deleteNote(idsupplier);
	 }

	

		
		RequestDispatcher rd = request.getRequestDispatcher("um_dashboard.jsp");
		rd.forward(request, response);
	}

}
