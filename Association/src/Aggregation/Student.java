package Aggregation;

public class Student {

	private String name,course;
	private Integer enroll_no;

	public Student(String name, String course, Integer enroll_no) {
		super();
		this.name = name;
		this.course = course;
		this.enroll_no = enroll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Integer getEnroll_no() {
		return enroll_no;
	}

	public void setEnroll_no(Integer enroll_no) {
		this.enroll_no = enroll_no;
	}



}
