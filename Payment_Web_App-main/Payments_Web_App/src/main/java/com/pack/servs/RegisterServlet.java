package com.pack.servs;

import com.pack.dao.*;
import java.sql.Date;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;  
  


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public RegisterServlet() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("username");
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String emailId = request.getParameter("email");
		String phNo = request.getParameter("phno");
		Date dob = Date.valueOf( request.getParameter("dob"));
		String address = request.getParameter("address");
		String pswd = request.getParameter("pswd");
		
		
		PaymentsWebAppDAO dao = new PaymentsWebAppDAO();
		try {
		dao.storeUserDetails(userName, firstName, lastName, emailId, phNo, dob, address, pswd);
		
		}
		catch ( Exception e) {
			e.printStackTrace();
		}
		
		response.setContentType("text/html");  
		response.getWriter().write("<p style='color:green;'>Registration Successfull! Please Login<p>");
		RequestDispatcher rd = request.getRequestDispatcher("/index.html");
		rd.include(request, response);
	}

}