package com.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddDeliveryNote")
public class AddDeliveryNote extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//geting the note from jsp and adning to variables
		String pid = request.getParameter("pid");
		String pdis = request.getParameter("pdis");
		int qty = Integer.parseInt(request.getParameter("qty"));
		double tot = Double.parseDouble(request.getParameter("tp"));
		String loc = request.getParameter("loc");
		

		boolean isTrue = false;
		boolean is = false;
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date dates = new Date();
		String date1 = formatter.format(dates);
		
		
		isTrue = com.db.AddDeliveryNote.addNote(pid, pdis,  qty, tot,date1, loc);
		
		if(isTrue == true) {
			request.setAttribute("msgReg", "true");
			//String msg1="msgReg";
		//response.sendRedirect("functions/user management/login.jsp?msg1="+msg1);

		} else if (isTrue == false) {
			request.setAttribute("msgReg", "false");
		}
		
		RequestDispatcher req = request.getRequestDispatcher("add_delivery_notes.jsp");
				req.forward(request, response);
		
	}
}
