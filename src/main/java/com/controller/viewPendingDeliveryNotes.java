package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.deletedUser;
import com.model.viewPendingNotes;

@WebServlet("/viewPendingDeliveryNotes")
public class viewPendingDeliveryNotes extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public viewPendingDeliveryNotes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			//TODO Auto-generated method stub

			List<viewPendingNotes> viewPendingNotes = com.db.viewPendingDeliveryNotes.userDetails();
			request.setAttribute("viewPendingNotes", viewPendingNotes);

			RequestDispatcher rd = request.getRequestDispatcher("view_pending_notes.jsp");
			rd.forward(request, response);
		}
	 
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}
}
