package com.pack.servs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.dao.PaymentsWebAppDAO;

@WebServlet("/BankAcctFormServlet")
public class BankAcctFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public BankAcctFormServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String accountNumber = request.getParameter("bankAcctNo");
		String acctHolderName = request.getParameter("AcctHolderName");
		String bankName = request.getParameter("bankName");
		String bankIFSCCode = request.getParameter("bankIfscCode");
		String bankAcctType = request.getParameter("bankAcctType");
		String phoneNumber = request.getParameter("ph_num");
		String bankAcctPin = request.getParameter("bankAcctPin");
		String userName = request.getParameter("username");
		
		PaymentsWebAppDAO dao = new PaymentsWebAppDAO();
		try {
		dao.storeUserBankDetails(accountNumber, acctHolderName, bankName, bankIFSCCode, bankAcctPin, bankAcctType, userName, 0, phoneNumber);
		}catch(Exception e) {
			e.printStackTrace();
		}
		response.setContentType("text/html");
		response.getWriter().write("<p style='color:green;'>Account Added Successfull!<p>");
		RequestDispatcher rd = request.getRequestDispatcher("/bankacctdetails.html");
		rd.include(request, response);
	}

}
