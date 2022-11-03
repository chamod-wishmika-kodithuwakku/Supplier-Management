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
import com.model.RejectNote;

@WebServlet("/view_Rejected_Notes")
public class view_Rejected_Notes extends HttpServlet{

public view_Rejected_Notes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//TODO Auto-generated method stub

		List<RejectNote> view_Rejected_Notes = com.db.view_Rejected_Notes.userDetails();
		
		request.setAttribute("view_Rejected_Notes", view_Rejected_Notes);

		RequestDispatcher rd = request.getRequestDispatcher("view_Rejected_Notes.jsp");
		rd.forward(request, response);
	}
 
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
