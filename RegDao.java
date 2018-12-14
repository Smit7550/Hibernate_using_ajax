package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import vo.RegVo;
import vo.RegVo1;

public class RegDao {
	public List search(RegVo obj)
	{
		List ls = new ArrayList();
		try
		{
			SessionFactory s=new Configuration().configure().buildSessionFactory();
			
			Session s1 = s.openSession();
			
			Transaction t = s1.beginTransaction();
			
			Query q = s1.createQuery("from RegVo WHERE username='"+obj.getUsername()+"' and password='"+obj.getPassword()+"'");
			ls = q.list();
			
			t.commit();
			
			s1.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return ls;
	}

	public List search(RegVo1 obj)
	{
		List ls = new ArrayList();
		try
		{
			SessionFactory s=new Configuration().configure().buildSessionFactory();
			
			Session s1 = s.openSession();
			
			Transaction t = s1.beginTransaction();
			
			Query q = s1.createQuery("from RegVo1 WHERE firstname='"+obj.getFirstname()+"'");
			ls = q.list();
			
			t.commit();
			
			s1.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return ls;
	}
}
