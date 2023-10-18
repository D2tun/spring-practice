package com.springDataJPA.springWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springDataJPA.springWebApp.bean.Course;
import com.springDataJPA.springWebApp.bean.Topic;
import com.springDataJPA.springWebApp.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable int id) {
		return this.courseService.getAllCourses(id);
	}
	
	@GetMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable int id) {
		return this.courseService.getCourse(id);
	}
	
	@PostMapping("/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable int topicId) {
		course.setTopic(new Topic(topicId, "", ""));
		this.courseService.addCourse(course);
	}
	
	@PutMapping("/topics/{topicId}/courses/{id}")
	public void updateCourses(@RequestBody Course course, @PathVariable int id, @PathVariable int topicId) {
		course.setTopic(new Topic(topicId, "", ""));
		this.courseService.updateCourse(course);
	}
	
	@DeleteMapping("/topics/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable int id) {
		this.courseService.deleteCourse(id);
	}
}
