package Aggregation;

import java.util.List;

public class College {

	private String collegename;
	private List<Course> course;

	public College(String collegename, List<Course> course) {
		super();
		this.collegename = collegename;
		this.course = course;
	}



	public String getCollegename() {
		return collegename;
	}

	public List<Course> CourseData(){
		return course; //always have return type
	}

	public Integer countStudent() {
		Integer StudentsInCollege=0;
		List<Student> students;
		for(Course c:course) {
			students =c.studentData();
			for(Student s: students) {
				StudentsInCollege++;
			}
		}
		return StudentsInCollege;
	}

}
