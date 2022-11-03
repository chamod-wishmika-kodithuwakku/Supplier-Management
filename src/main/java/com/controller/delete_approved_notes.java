package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete_approved_notes")
public class delete_approved_notes extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idsupplier = Integer.parseInt(request.getParameter("idsupplier"));

		
		if (request.getParameter("btn2") != null){
			//deleting the aporved note
			com.db.delete_approved_note.deleteUser(idsupplier);
			RequestDispatcher rd = request.getRequestDispatcher("um_dashboard.jsp");
			rd.forward(request, response);
		 }
		else if (request.getParameter("btn4") != null){
			com.db.delete_approved_note.deleteUser2(idsupplier);
			RequestDispatcher rd = request.getRequestDispatcher("um_dashboard.jsp");
			rd.forward(request, response);
		} 
		
		
		
		
	}
}
