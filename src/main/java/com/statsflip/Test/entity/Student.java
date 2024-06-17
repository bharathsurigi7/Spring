package com.statsflip.Test.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {
	    
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Id
		Integer sid;
	
		@Column(unique = true)
		String sname;
		
		String email;
		String pno;
		
		
		
		
		
}