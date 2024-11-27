package com.example.SpringDb.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.SpringDb.Entity.Student;

@Repository
public class Dao {
	
	
	@Autowired
	SessionFactory factory ;
	
	public String InsertData(Student s )
	{
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		
		ss.persist(s);
		tr.commit();
		ss.close();
		
		return "Record Is Save >>>>>>>>>";
	
	}
	
	public String UpdateData(int id, Student updatedStudent) {
	    Session ss = factory.openSession();
	    Transaction tr = ss.beginTransaction();

	    Student existingStudent = ss.get(Student.class, id);
	    	
	        existingStudent.setName(updatedStudent.getName());
	        existingStudent.setCity(updatedStudent.getCity());
	        
	       
	        ss.merge(existingStudent);
	        tr.commit();
	        ss.close();
	        
	        return "The Record is Updated......";
	        
	  
	}

	
	public String DeleteData(int id){

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		Student s = ss.get(Student.class,id );
		ss.remove(s);
		tr.commit();
		ss.close();
		
		return "Data is deleted sucessfully......";
	}

	public Student GetSingleRecord(int id)
	{
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Student where id = :id";
		Query<Student> query = ss.createQuery(hqlQuery, Student.class);
		query.setParameter("id", id);
		Student s = query.uniqueResult();

		
		tr.commit();
		ss.close();
		return s ;
	}

	
	public List<Student> getAllData() { // Changed method name to follow camel case convention
	    Session ss = factory.openSession();
	    Transaction tr = ss.beginTransaction();
	    String hqlQuery = "from Student"; // Fixed case-sensitive entity name
	    Query<Student> query = ss.createQuery(hqlQuery, Student.class);
	    List<Student> list = query.list();
	    tr.commit();
	    ss.close();
	    return list;
	}


}
