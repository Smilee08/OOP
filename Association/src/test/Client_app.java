package test;

import java.util.ArrayList;
import java.util.List;

import data.Moblie;
import data.Person;

public class Client_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Association is a Has-a relationship
		//association is 2 type
		//1)Aggregation & 2)Composition

		//one-many relationship is seen between person and mobile no.
		//a person can have more then 1 phone no.

		Person person=new Person();
		person.setName("Smile");

		Moblie n1=new Moblie();
		n1.setMobile_no("8568008899");
		Moblie n2=new Moblie();
		n2.setMobile_no("8989766767");

		List<Moblie> numberList=new ArrayList<Moblie>();
		numberList.add(n1);
		numberList.add(n2);

		person.setNumber(numberList);
		System.out.println(person.getNumber()+"are mobile no. of person "+person.getName());

		//output
		//[data.Moblie@123a439b, data.Moblie@7de26db8]are mobile no. of person Smile

	}

}
