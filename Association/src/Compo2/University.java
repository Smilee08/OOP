package Compo2;

import java.util.List;

public class University {
	//	encapsulation class have private attribute and public getter and setters
	//classes cant be private or protected
	//Acess modifier
	//private within the calss
	//protected within the packages and outside the pakage with the help of chid class

	private final List<Collage> colleges; //use of final word in compostion of strong agregation

	public University(List<Collage> colleges) {
		this.colleges = colleges;
	}

	public List<Collage> getTotalCollegesInUniversity(){
		return colleges;
	}

}
