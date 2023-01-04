package Aggregation;

import java.util.List;

public class Course {

	private String name;
	private List<Student> student;

	public Course(String name, List<Student> student) {
		super();
		this.name = name;
		this.student = student;
	}

	public List<Student> studentData(){
		return student; //always have return type
	}



}
