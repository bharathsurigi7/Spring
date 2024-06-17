package com.statsflip.Test.Repositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.statsflip.Test.entity.Student;

@Repository
public interface Studentrepo extends CrudRepository<Student, Integer> {
	
	
	

}
