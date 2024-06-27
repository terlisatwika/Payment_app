package com.pack.servs;

import com.pack.dao.*;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userNameOrPhoneNo = request.getParameter("username");
		String password = request.getParameter("pswd");

		System.out.println(userNameOrPhoneNo);
		System.out.println(password);

		PaymentsWebAppDAO dao = new PaymentsWebAppDAO();
		try {
			if (dao.loginValidate(userNameOrPhoneNo, password)) {
				response.setContentType("text/html");
				RequestDispatcher rd = request.getRequestDispatcher("/dashboard.html");
				rd.forward(request, response);

			} else {
				response.setContentType("text/html");  
				response.getWriter().write("<p style='color:red;'> Login failed try again !!! <p>");
				RequestDispatcher rd = request.getRequestDispatcher("/index.html");
				rd.include(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}