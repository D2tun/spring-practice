package com.springboot.app5.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.app5.bean.Topic;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
									new Topic(1, "springFramework", "description"),
									new Topic(2, "springFrameworkMVC", "description"),
									new Topic(3, "springFrameworkBOOT", "description")
									));

	public List<Topic> getAllTopics() {
		return this.topics;
	}
	
	public Topic getTopic(int id) {
		return this.topics.stream().filter(t -> t.getId() == id).findAny().get();
	}
	
	public void addTopic(Topic topic) {
		this.topics.add(topic);
	}
	
	public void updateTopic(int id, Topic topic) {
		this.topics.set(id, topic);
	}
	
	public void deleteTopic(int id) {
		this.topics.remove(id);
	}
}
