package com.amit.javabrains.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("1", "2", "3"),
			new Topic("2", "2", "3"),
			new Topic("3", "2", "3"),
			new Topic("5", "6", "7")));
	
	public List<Topic> getAllTopics(){	
		//return topics;
		
		List<Topic> topic = new ArrayList<>();
		topicRepository.findAll().forEach(topic::add);
		return topic;
	}
	
	public Topic getTopic(String id){
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		//topics.add(topic);
		topicRepository.save(topic);
	}
	
	public void updateTopic(Topic topic, String id) {
		
		/*for(int i=0;i<topics.size();i++){
			Topic t = topics.get(i);
			if(t.getId().equals(id)){
				topics.set(i, topic);
			}
		}*/
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		topicRepository.delete(id);
	}

}
