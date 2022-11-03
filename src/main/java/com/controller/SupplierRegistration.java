package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SupplierRegistration")
public class SupplierRegistration {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
	
		
	    String password = request.getParameter("password");
		String email = request.getParameter("email");
		
		boolean isTrue = false;

		
	
		isTrue = com.db.SupplierRegistration.supplierReg(name, password, email);
		
		if(isTrue == true) {
			request.setAttribute("msgReg", "true");
			//String msg1="msgReg";
		//response.sendRedirect("functions/user management/login.jsp?msg1="+msg1);

		} else if (isTrue == false) {
			request.setAttribute("msgReg", "false");
		}
		
		RequestDispatcher req = request.getRequestDispatcher("add_supplier.jsp");
				req.forward(request, response);
	}
}
