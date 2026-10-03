package com.iostream.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iostream.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student s1=new Student();
        s1.setId(1);
        s1.setName("Afrin");
        s1.setRollno(12);
        s1.setCity("Dhaka");
        
        Configuration cfg=new Configurationn();
        cfg.configure("/com/iostream/resources/Student.cfg.xml");
        
        SessionFactory  sessionFactory =cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        
        try
        {
        	session.save(s1);
            transaction.commit();
            System.out.println("success");
        }
        catch(Exception e)
        {
        	transaction.rollback();
        	System.out.println("fail");
        	e.printStackTrace();
        	
        }
        finally
        {
        	session.close();
        	sessionFactory.close();
        }
        
        
        
        
    }
}
