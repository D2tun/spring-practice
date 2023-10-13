package com.springDataJPA.springWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springDataJPA.springWebApp.bean.Topic;
import com.springDataJPA.springWebApp.repo.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		this.topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(int id) {
		return this.topicRepository.findById(id).get();
	}
	
	public void addTopic(Topic topic) {
		this.topicRepository.save(topic);
	}
	
	public void updateTopic(int id, Topic topic) {
		this.topicRepository.save(topic);
	}
	
	public void deleteTopic(int id) {
		this.topicRepository.deleteById(id);
	}
}
