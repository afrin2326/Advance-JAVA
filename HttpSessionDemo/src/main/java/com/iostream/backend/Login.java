package com.iostream.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginForm")
public class Login extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter out=resp.getWriter();
		
		String myEmail=req.getParameter("email1");
		String myPass=req.getParameter("pass1");
		
		
		if(myEmail.equals("afrin@123")&& myPass.equals("afrin123"))
		{
			String name="afrin amin";
			
			HttpSession session=req.getSession();
			session.setAttribute("session_name", myPass);
			
			RequestDispatcher rd=req.getRequestDispatcher("/userProfile");
			rd.forward(req, resp);
		}
		else
		{
			out.println("<h3 style='color:red'> Email Id and Password didnt matched </h3>");
			
			RequestDispatcher rd=req.getRequestDispatcher("/login.html");
			rd.include(req, resp);
		}
		
		
	}

}
