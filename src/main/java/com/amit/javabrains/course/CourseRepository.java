package com.amit.javabrains.course;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Serializable>{

	
}
