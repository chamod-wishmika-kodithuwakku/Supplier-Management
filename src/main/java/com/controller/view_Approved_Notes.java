package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.ApproveNote;

@WebServlet("/view_Approved_Notes")
public class view_Approved_Notes extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public view_Approved_Notes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//TODO Auto-generated method stub

		List<ApproveNote> view_Approved_Notes = com.db.view_Approved_Notes.userDetails();
		
		request.setAttribute("view_Approved_Notes", view_Approved_Notes);

		RequestDispatcher rd = request.getRequestDispatcher("view_approved_notes.jsp");
		rd.forward(request, response);
	}
 
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
