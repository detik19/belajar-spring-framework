package com.subrutin.springweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

public class HelloServlet implements HttpRequestHandler{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2677865532493033460L;
	private Company company;

//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
//		System.out.println(company);
//		resp.setContentType("text/html");
//		PrintWriter out = resp.getWriter();
//		String title = "Halo Servlet";
//		String docType ="<!DOCTYPE html>";
//	    out.println(docType+"<html><head><title>"
//	    		+ title
//	    		+ "</title></head>"
//	    		+ "<body>Halo ini servlet 4</body></html>");
//	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(company);
		
		
	}

	
}
