package com.te.hibernatedemo.bean;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class StudentImplemation {
	EntityManagerFactory factory=null;
	EntityTransaction transaction=null;
	EntityManager manager=null;
	Scanner s=new Scanner(System.in);
	Student student=new Student();
	
		

	public void displayingDetailsOfStudents()
	{
		
			
			try {
				factory=Persistence.createEntityManagerFactory("student");
				 manager=factory.createEntityManager();
				 
				Query query=manager.createQuery("from Student");
				
				
		
				 List<Student> list= query.getResultList();
				 for(Student student:list)
				 {
					 System.out.println(student);
				 }
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				
				if(factory!=null)
				{
					factory.close();
				}
				if(manager!=null)
				{
					manager.close();
				}
				
			
			}
	}
	public void displayParticularData(int id)
	{
		
			
			try {
				factory=Persistence.createEntityManagerFactory("student");
				 manager=factory.createEntityManager();
				 
				
				transaction=manager.getTransaction();
				
			Query	 query=manager.createQuery(" from Student where id=:id");
				 query.setParameter("id", id);
				

				Student student=(Student) query.getSingleResult();
			 
				if(student!=null)
				{
				System.out.println(student.getId());
				System.out.println(student.getName());
				System.out.println(student.getPhoneno());
				System.out.println(student.getStandard());
				}
				
		
				
				
		
				
				
			}
			catch(Exception e)
			{
				throw new InvalidIdException();
			}
			finally
			{
				
				if(factory!=null)
				{
					factory.close();
				}
				if(manager!=null)
				{
					manager.close();
				}
				
			
			}
	}
	public void  toDeleteParticularData(int id)
	{
		try {
			factory=Persistence.createEntityManagerFactory("student");
			 manager=factory.createEntityManager();
			transaction=manager.getTransaction();
			transaction.begin();
			 Query query=manager.createQuery("delete from Student where id=:id");
			 query.setParameter("id", id);
			
			int result=query.executeUpdate();
			System.out.println("successfully deleted");
			transaction.commit();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new InvalidIdException();
		}
	}
	public void toUpdateName(int id)
	{
		
		try {
			factory=Persistence.createEntityManagerFactory("student");
			 manager=factory.createEntityManager();
			 transaction=manager.getTransaction();
			 transaction.begin();
			 Query query=manager.createQuery("from Student where id=:id");
			 query.setParameter("id",id);
			 Student student=(Student) query.getSingleResult();
			

			if(student!=null)
				
			{
 	
			
				query=manager.createQuery("update Student set name=:name where id=:id");
		
				query.setParameter("id",id);
				System.out.println("enter the name to be updated");
				String name=s.next();
				 query.setParameter("name",name);
				 int result=query.executeUpdate();
				
			
			}		
				transaction.commit();
			}
		catch(Exception e)
		{
		 	throw new InvalidIdException();
		}
		finally
		{
			
			if(factory!=null)
			{
				factory.close();
			}
			if(manager!=null)
			{
				manager.close();
			}
			
		
		}
	}

	public void toUpdatePhoneno(int id)
	{
		
		try {
			factory=Persistence.createEntityManagerFactory("student");
			 manager=factory.createEntityManager();
			 transaction=manager.getTransaction();
			 transaction.begin();
			 Query query=manager.createQuery("from Student where id=:id");
			 query.setParameter("id",id);
			 Student student=(Student) query.getSingleResult();
			

			if(student!=null)
				
			{
 	
			
				query=manager.createQuery("update Student set phoneno=:phoneno where id=:id");
		
				query.setParameter("id",id);
				System.out.println("enter the phoneno to be updated");
				long phoneno=s.nextLong();
				 query.setParameter("phoneno",phoneno);
				 int result=query.executeUpdate();
				
			
			}		
				transaction.commit();
			}
		catch(Exception e)
		{
		 	throw new InvalidIdException();
		}
		finally
		{
			
			if(factory!=null)
			{
				factory.close();
			}
			if(manager!=null)
			{
				manager.close();
			}
			
		
		}
	}
	public void toUpdateStandard(int id)
	{
		
		try {
			factory=Persistence.createEntityManagerFactory("student");
			 manager=factory.createEntityManager();
			 transaction=manager.getTransaction();
			 transaction.begin();
			 Query query=manager.createQuery("from Student where id=:id");
			 query.setParameter("id",id);
			 Student student=(Student) query.getSingleResult();
			

			if(student!=null)
				
			{
 	
			
				query=manager.createQuery("update Student set standard=:standard where id=:id");
		
				query.setParameter("id",id);
				System.out.println("enter the phoneno to be updated");
				String Standard=s.next();
				 query.setParameter("standard",Standard);
				 int result=query.executeUpdate();
				
			
			}		
				transaction.commit();
			}
		catch(Exception e)
		{
		 	throw new InvalidIdException();
		}
		finally
		{
			
			if(factory!=null)
			{
				factory.close();
			}
			if(manager!=null)
			{
				manager.close();
			}
			
		
		}
	}


}
