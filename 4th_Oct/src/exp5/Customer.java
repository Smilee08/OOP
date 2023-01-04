package exp5;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(".........Juice Center...........\n");
		System.out.println("List of drinks available\n");
		System.out.println("-----------MilkShake------------");
		System.out.println("Banana MilkShake");
		System.out.println("Chikoo MilkShake");
		System.out.println("Chocolate MilkShake");
		System.out.println("Mango MilkShake");
		System.out.println("Strawberry MilkShake");
		System.out.println("\n-----------Juice------------");
		System.out.println("Apple Juice");
		System.out.println("Lime Juice");
		System.out.println("Orange Juice");
		System.out.println("Pineapple Juice");
		System.out.println("Watermelon Juice");
		System.out.println("\n---------------------------------------------");
		
Shop shop=new Shop();
shop.setLocation("Panjim");
System.out.println("Shop Location:"+ shop.getLocation());
List<String> l=new ArrayList<>();
l.add("Apple Juice");
l.add("Lime Juice");
Drink drink1=(Drink) shop.order(l);
shop.served();

drink1.consumed();

System.out.println();
//Drink d=new Drink(); //cant use as it is abstract class

Shop shop2=new Shop();
shop2.setLocation("Margoa");
System.out.println("Shop Location:"+ shop2.getLocation());
List<String> l2=new ArrayList<>();
l2.add("Mango MilkShake");
l2.add("Strawberry MilkShake");
Drink drink2=(Drink) shop2.order(l2);
//shop2.served();

	}

}
