package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AdditionServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String n1=req.getParameter("num1");
		String n2=req.getParameter("num2");
		int num1=Integer.parseInt(n1);
		int num2=Integer.parseInt(n2);
		int resu=num1+num2;
		PrintWriter out=res.getWriter();
		out.println("<p> Result ="+(resu)+"</p>");
		
	}

}
