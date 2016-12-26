package com.amit.javabrains.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private  CourseService courseService;
	
	@RequestMapping("/topics")
	public List<Course> getAllontollers(){
		return courseService.getAllCourses();
	}
	
	@RequestMapping("/topics/{id}")
	public Course getTpoic(@PathVariable String id){
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Course topic){
		courseService.addCourse(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Course topic, @PathVariable String id){
		courseService.updateCourse(topic, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id){
		courseService.deleteCourse(id);
	}
	
	
		
	

}
