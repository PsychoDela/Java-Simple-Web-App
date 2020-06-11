package com.faris.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Zadaca")
public class DataIO extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("name");
		String lastName = request.getParameter("lastname");
		String dob = request.getParameter("dob");
		String email = request.getParameter("email");
		String pob = request.getParameter("pob");
		
		request.setAttribute("name", name);
		request.setAttribute("lastName", lastName);
		request.setAttribute("dob", dob);
		request.setAttribute("email", email);
		request.setAttribute("pob", pob);
		
		request.getRequestDispatcher("/output.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
