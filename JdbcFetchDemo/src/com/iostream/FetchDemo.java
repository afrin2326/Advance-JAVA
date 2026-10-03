package com.iostream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchDemo {

	public static void main(String[] args)throws Exception 
	{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_database", "root", "SoftwareEng");
		PreparedStatement ps=con.prepareStatement("select * from register");
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
        {
            String name1 = rs.getString("name");
            System.out.println(name1);
            
            String email1 = rs.getString("email");
            System.out.println(email1);
            
            String gender1 = rs.getString("gender");
            System.out.println(gender1);
            
            String city1 = rs.getString("city");
            System.out.println(city1);
            
            System.out.println("--------------------");
            
        }
		
		rs.close();
		ps.close();
		con.close();

		

	}

}
