package com.iostream;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class MyServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req,HttpServletResponse res)throws IOException
	{
		 res.setContentType("text/html");  
	     PrintWriter out = res.getWriter();
	        
		String myName=req.getParameter("name1");
		String myEmail=req.getParameter("email1");
		String myPassword=req.getParameter("password1");
		String gender=req.getParameter("gender");
		String[] cities = req.getParameterValues("city");
		
		    out.println("<html><body>");
	        out.println("<h2>User Details</h2>");
	        out.println("<p>Name: " + myName + "</p>");
	        out.println("<p>Email: " + myEmail + "</p>");
	        out.println("<p>Password: " + myPassword + "</p>");
	        out.println("<p>Gender: " + gender + "</p>");

		
		out.print("<p>Cities Selected:</p>");
        if (cities != null) {
            out.println("<ul>");
            for (String city : cities) {
                out.println("<li>" + city + "</li>");
            }
            out.println("</ul>");
        } else {
            out.println("<p>No cities selected.</p>");
        }

        out.println("</body></html>");
        
		
		
		
	}

}
