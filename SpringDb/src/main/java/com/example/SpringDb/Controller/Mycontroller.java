package com.example.SpringDb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDb.Entity.Student;
import com.example.SpringDb.Service.StudentService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Mycontroller {
	
	@Autowired
	StudentService service ;
	
	@PostMapping("/savedata")
	public String InsertData(@RequestBody Student s) {
		String msg = service.InsertData(s);
		return msg;
		
	}
	
	@PutMapping("/update/{id}")
    public String updateData(@PathVariable int id, @RequestBody Student s) {
		
		String msg = service.UpdateData(id, s);
        return "Record is Updated.........";
    }
	

	@DeleteMapping("/DeleteData/{id}")
	public String DeleteData(@PathVariable int id) {
		String msg = service.DeleteData(id);
		return msg ;		
	}
	
	@GetMapping("/GetSingleRecord/{id}")
	public Student GetSingleRecord(@PathVariable int id) {
		Student s = service.GetSingleRecord(id);
	    return s;
	}

	
	@GetMapping("/GetALLData")
	public List<Student> getAllData() { 
	    List<Student> list = service.getAllData(); 
	    return list;
	}
	
	
}
