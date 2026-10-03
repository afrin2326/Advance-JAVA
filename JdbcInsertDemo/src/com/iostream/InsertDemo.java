package com.iostream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo
{
	public static void main(String[] args)throws Exception
	{ 
		String name="Srity";
		String email="srity@gmail.com";
		String gender ="female";
		String city="Chittagong";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_database", "root", "SoftwareEng");
		PreparedStatement ps=con.prepareStatement("Insert into register values (?,?,?,?)");
		
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, gender);
		ps.setString(4, city);
		
		int i=ps.executeUpdate();
		if(i>0)
		{
			System.out.println("Successfully inserted");
		}
		else
		{
			System.out.println("failed");
		}
		
		 
		
	}
	
 
	
}
