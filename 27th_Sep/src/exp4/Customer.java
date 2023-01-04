package exp4;

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
Drink drink=shop.order("Mango MilkShake");
shop.served();
drink.consumed();

System.out.println();
//Drink d=new Drink(); //cant use as it is abstract class

Shop shop2=new Shop();
shop2.setLocation("Margoa");
System.out.println("Shop Location:"+ shop2.getLocation());
Drink drink1=shop2.order("Lime Juice");
shop2.served();

	}

}
