package com.springDataJPA.springWebApp.repo;

import org.springframework.data.repository.CrudRepository;

import com.springDataJPA.springWebApp.bean.Topic;

public interface TopicRepository extends CrudRepository<Topic, Integer> {

	
}
