package com.pack.servs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

@WebServlet("/WalletToWalletTransServlet")
public class WalletToWalletTransServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public WalletToWalletTransServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().write("This is Wallet to Wallet page");

	}

}
