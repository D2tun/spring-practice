package com.springDataJPA.springWebApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springDataJPA.springWebApp.bean.Course;
import com.springDataJPA.springWebApp.bean.Topic;
import com.springDataJPA.springWebApp.repo.CourseRepository;
import com.springDataJPA.springWebApp.repo.TopicRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(int topicId) {
		List<Course> courses = new ArrayList<>();
		this.courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(int id) {
		return this.courseRepository.findById(id).get();
	}
	
	public void addCourse(Course course) {
		this.courseRepository.save(course);
	}
	
	public void updateCourse(Course course) {
		this.courseRepository.save(course);
	}
	
	public void deleteCourse(int id) {
		this.courseRepository.deleteById(id);
	}

}
