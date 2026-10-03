package com.iostream.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {

	public static void main(String[] args)throws Exception
	{
		
		String email="srity@gmail.com";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_database", "root", "SoftwareEng");
		PreparedStatement ps=con.prepareStatement("delete from register  where email=?");
		
		
		ps.setString(1, email);
		
		int i=ps.executeUpdate();
		
		if(i>0)
		{
			System.out.println("Successfully Deleted");
		}
		else
		{
			System.out.println("failed");
		}
		
		

	}

}
