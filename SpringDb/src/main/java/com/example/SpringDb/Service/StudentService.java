package com.example.SpringDb.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.SpringDb.Dao.Dao;
import com.example.SpringDb.Entity.Student;



@org.springframework.stereotype.Service
public class StudentService {
	
	@Autowired
	 Dao dao ;
	 public String InsertData(Student s) {
		 
		 String msg = dao.InsertData(s); 
		 return msg;	 
	 }
	 
	 public String UpdateData(int id,Student s) {
			
			String msg = dao.UpdateData(id, s);
	        return "Record is Updated.........";
	    }
	 
	
	 public String DeleteData(int id)
	 {
		 String msg = dao.DeleteData(id);
		 return msg;
		 
	 }
	 
	 @GetMapping("/GetSingleRecord/{id}")
	 public Student GetSingleRecord(@PathVariable int id) {	 
		 Student s = dao.GetSingleRecord(id);
		 return s ;  
	 }
	 
	 public List<Student> getAllData() { // Changed method name to follow camel case convention
		    List<Student> list = dao.getAllData(); // Fixed DAO method name call
		    return list;
		}
}
