package exp4;

public class Shop {
	 private String location;
	 
	
	//constructer
	public Shop() { //empty constructer	
	}
	
	public Shop(String location) {//parametarized constructer
		this.location=location;
	}
	
	//getter and setters
	public String getLocation() {//getter
		return location;
	}

	public void setLocation(String location) {//setter
		this.location = location;
	}

	public Drink order(String drinkname) {
		System.out.println("Order Placed:"+drinkname);
		Drink d=null; //d=null then only u can return d otherwise it will be return null so logic is to return d and not null
		if(drinkname=="Apple Juice") {
			d=new Apple_Juice();
		}else if(drinkname=="Lime Juice"){
			d=new Lime_juice();
		}else if (drinkname=="Orange Juice") {
			d=new Orange_juice();
		}else if(drinkname=="Pineapple Juice") {
			d=new Pineapple_Juice();
		}
		else if(drinkname=="Watermelon Juice") {
			d=new Watermelon_Juice();
		}
		else if(drinkname=="Banana MilkShake") {
			d=new BananaMS();
		}
		else if(drinkname=="Chikoo MilkShake") {
			d=new ChikooMS();
		}
		else if(drinkname=="Chocolate MilkShake") {
			d=new ChocolateMS();
		}
		else if(drinkname=="Mango MilkShake") {
			d=new MangoMS();
		}else if(drinkname=="Strawberry MilkShake") {
			d=new StrawberryMS();
		}else {
			System.out.println("Please order as per the list.");
		}
		//return drink;
		return d;
	}
	
	void served() {
		System.out.println("Drink Served.");
	}
}
