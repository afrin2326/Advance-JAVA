package com.iostream.backend;

import java.io.IOException;
import java.io.PrintWriter;



import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/userProfile")
public class Profile extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession session=req.getSession();
		String name=(String)session.getAttribute("session_name"); 
		
		PrintWriter out=resp.getWriter();
		
		out.println("<h3 style='color:green'> Welcome : "+name+"</h3>");
		
	}

}
