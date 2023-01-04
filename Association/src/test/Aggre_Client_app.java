package test;

import java.util.ArrayList;
import java.util.List;

import Aggregation.College;
import Aggregation.Course;
import Aggregation.Student;

public class Aggre_Client_app {

	public static void main(String[] args) {
		// TODO Auto-generated method
		//aggregation follows the one-to-one or one-way relationship
		//If 2 entities are in the aggregation compostion and one entity fails due to some errror,it will not affect the other entity
		//example of toy and battery
		//the battery belong to a toy and if the toy breaks & deletes from our database,the battery will still remaining
		//in our database,and it may still be working.So in aggregation ,objects always have their own lifecycle when the ownership exists there

		Student s4=new Student("Seema","MBA",104);
		Student s5=new Student("Seema","MBA",105);
		Student s6=new Student("Seema","MBA",106);

		Student s1=new Student("Smile","MCA",101);
		Student s2=new Student("Smita","MCA",102);
		Student s3=new Student("Seema","MCA",103);

		List<Student> mca=new ArrayList<Student>();
		mca.add(s1);
		mca.add(s3);
		mca.add(s2);

		List<Student> mba=new ArrayList<Student>();
		mba.add(s4);
		mba.add(s5);
		mba.add(s6);


		Course mca_s=new Course("MCA",mca);
		Course mba_s=new Course("MBA",mba);

		List<Course> course=new ArrayList<Course>();
		course.add(mca_s);
		course.add(mba_s);

		List<Student> std=mca_s.studentData();
		for(Student s:std) {
			System.out.println("Name:"+s.getName()+"Enroll no.:"+s.getEnroll_no()+" Course:"+s.getCourse());
		}



		College coll=new College("Goa University",course);
		System.out.print("\nTotal no. of students "+coll.getCollegename()+" is "+coll.countStudent());


	}

}
