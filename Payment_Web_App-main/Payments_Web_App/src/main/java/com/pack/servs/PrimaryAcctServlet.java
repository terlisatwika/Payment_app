package com.pack.servs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

@WebServlet("/PrimaryAcctServlet")
public class PrimaryAcctServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PrimaryAcctServlet() {
		super();
	}
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		RequestDispatcher rd = request.getRequestDispatcher("/primaryacct.html");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		response.setContentType("text/html");
//		RequestDispatcher rd = request.getRequestDispatcher("/primaryacct.html");
//		rd.forward(request, response);
		doGet(request, response);
	}

}
