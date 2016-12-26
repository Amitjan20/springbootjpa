package com.amit.javabrains.course;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Serializable>{
	
	public List<Course> findByTopicId(String name);

	
}
