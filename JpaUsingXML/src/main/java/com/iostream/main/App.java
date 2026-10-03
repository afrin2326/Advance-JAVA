package com.iostream.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.iostream.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Student std1=new Student();
    	std1.setId(1);
        std1.setName("Afrin");
        std1.setRollno(12);
        std1.setCity("Dhaka");
    	
    	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("main-persistence-unit");
    	
    	EntityManager entityManager =entityManagerFactory.createEntityManager();
    	EntityTransaction entityTransaction =entityManager.getTransaction();
    	
    	try
    	{
    		entityTransaction.begin();
    		entityManager.persist(std1);
    		entityTransaction.commit();
    		System.out.println("success");
    	}
    	catch(Exception e)
    	{
    		entityTransaction.rollback();
    		System.out.println("fail");
    		e.printStackTrace();
    		
    	}
    	finally
    	{
    		entityManager.close();
    		entityManagerFactory.close();
    	}
    }
}
