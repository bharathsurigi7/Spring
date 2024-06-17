package com.statsflip.Test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.statsflip.Test.Repositary.Studentrepo;
import com.statsflip.Test.entity.Student;

@RestController
public class User {
	
	@Autowired
	Studentrepo repo;
	
	@GetMapping("")
	public Student aa(){
		
		Student st = new Student();
		st.setEmail("asfs");
		st.setPno("asfds");
		st.setSname("asdfasdf");
		
		return repo.save(st);
		
	}

}
