package test;

import exam.Black_pant;
import exam.Blue_shirt;
import exam.Customer;
import exam.E_com_plaform;
import exam.Green_saree;
import exam.Jean_pant;
import exam.Pink_Dress;
import exam.Product;
import exam.Royal_blue_salvar;

public class Client_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----E-Commerce Platform Amazon--------\n");
		//Male wear
		Black_pant bp=new Black_pant(101,"Male wear",1000);
		Blue_shirt bs=new Blue_shirt(102,"Male wear",600);
		
		//Female wear
		Green_saree gs=new Green_saree(103,"Female wear",1500);
		Royal_blue_salvar rs=new Royal_blue_salvar(104,"Female wear",1000);
		
		//child
		Jean_pant jp=new Jean_pant(105,"Child wear",500);
		Pink_Dress pd=new Pink_Dress(106,"Child wear",600);
		
		
		Customer c1=new Customer(1,101,true,false);
		Customer c2= new Customer(2,103,true,true);
		Customer c3= new Customer(2,106,false,true);
		
		//E_com_plaform ep=new E_com_plaform();
		
		
		
	}

}
