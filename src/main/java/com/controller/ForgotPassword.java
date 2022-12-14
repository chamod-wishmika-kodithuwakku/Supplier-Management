package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.Login;
import com.db.encriptPasswordHelper;

/**
 * Servlet implementation class ForgotPassword
 */
@WebServlet("/ForgotPassword")
public class ForgotPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String answer = request.getParameter("answer");
		String password = request.getParameter("password");

		String encriptPass = encriptPasswordHelper.changePassToEncript(password);

		boolean forgotpass= com.db.Login.forgotPassword(email, answer, encriptPass);
		
		if(forgotpass==true) {
			request.setAttribute("forgot", "true");
		}
		else {
			request.setAttribute("forgot", "false");
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}

}
