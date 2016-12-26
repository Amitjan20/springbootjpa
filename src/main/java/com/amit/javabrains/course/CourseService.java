package com.amit.javabrains.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;
	
	private List<Course> topics = new ArrayList<>(Arrays.asList(
			new Course("1", "2", "3"),
			new Course("2", "2", "3"),
			new Course("3", "2", "3"),
			new Course("5", "6", "7")));
	
	public List<Course> getAllCourses(){	
		//return topics;
		
		List<Course> topic = new ArrayList<>();
		courseRepository.findAll().forEach(topic::add);
		return topic;
	}
	
	public Course getCourse(String id){
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
		return courseRepository.findOne(id);
	}

	public void addCourse(Course topic) {
		//topics.add(topic);
		courseRepository.save(topic);
	}
	
	public void updateCourse(Course topic, String id) {
		
		/*for(int i=0;i<topics.size();i++){
			Topic t = topics.get(i);
			if(t.getId().equals(id)){
				topics.set(i, topic);
			}
		}*/
		courseRepository.save(topic);
	}

	public void deleteCourse(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		courseRepository.delete(id);
	}

}
