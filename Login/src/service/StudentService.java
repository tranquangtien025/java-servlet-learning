package service;

import entity.Student;

public class StudentService {
	public Student getStudent(String id) {		
		return new Student("SV002", "Tien", "Quang Tri");
	}
}
//vao jstl