package exp5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import exp5.Apple_Juice;
import exp5.BananaMS;
import exp5.ChikooMS;
import exp5.ChocolateMS;
import exp5.Drink;
import exp5.Lime_juice;
import exp5.MangoMS;
import exp5.Orange_juice;
import exp5.Pineapple_Juice;
import exp5.StrawberryMS;
import exp5.Watermelon_Juice;

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
	 void served() {
		System.out.println("Drink Served.");
	}


	/*public Drink order(List<String> l) {//Collection<? extends Drink>
		Drink d=null;
		System.out.println("Order Placed:"+l);
		
		if(l.contains("Apple Juice")) {
			d=new Apple_Juice();
		}
		if(l.contains("Lime Juice")){
			d=new Lime_juice();
		}
		if (l.contains("Orange Juice")) {
			d=new Orange_juice();
		}
		if(l.contains("Pineapple Juice")) {
			d=new Pineapple_Juice();
		}
	    if(l.contains("Watermelon Juice")) {
			d=new Watermelon_Juice();
		}
	    if(l.contains("Banana MilkShake")) {
			d=new BananaMS();
		}
	    if(l.contains("Chikoo MilkShake")) {
			d=new ChikooMS();
		}
		if(l.contains("Chocolate MilkShake")) {
			d=new ChocolateMS();
		}
		if(l.contains("Mango MilkShake")) {
			d=new MangoMS();
		}
		if(l.contains("Strawberry MilkShake")) {
			d=new StrawberryMS();
		}
		
		return d;
	

	
	}*/
	 public List<Drink> order(List<String> l) {//Collection<? extends Drink>
			Drink d=null;
			System.out.println("Order Placed:"+l);
			
			if(l.contains("Apple Juice")) {
				d=new Apple_Juice();
			}
			if(l.contains("Lime Juice")){
				d=new Lime_juice();
			}
			if (l.contains("Orange Juice")) {
				d=new Orange_juice();
			}
			if(l.contains("Pineapple Juice")) {
				d=new Pineapple_Juice();
			}
		    if(l.contains("Watermelon Juice")) {
				d=new Watermelon_Juice();
			}
		    if(l.contains("Banana MilkShake")) {
				d=new BananaMS();
			}
		    if(l.contains("Chikoo MilkShake")) {
				d=new ChikooMS();
			}
			if(l.contains("Chocolate MilkShake")) {
				d=new ChocolateMS();
			}
			if(l.contains("Mango MilkShake")) {
				d=new MangoMS();
			}
			if(l.contains("Strawberry MilkShake")) {
				d=new StrawberryMS();
			}
			
			return (List<Drink>) d;
		

		
		}
	
}
