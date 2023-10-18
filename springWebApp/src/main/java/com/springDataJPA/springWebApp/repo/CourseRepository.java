package com.springDataJPA.springWebApp.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springDataJPA.springWebApp.bean.Course;

public interface CourseRepository extends CrudRepository<Course, Integer> {

	public List<Course> findByTopicId(int id);
}
