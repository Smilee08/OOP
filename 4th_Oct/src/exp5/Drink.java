package exp5;

public abstract class Drink {
 private Integer volume;
 
//constructer
	public Drink() {
		//System.out.println("Drink object is created.");
	}
	
	public Drink(Integer volume) {
		this.volume=volume;
	}
	
	//getter and setters
	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	static void consumed() { //static methods only can be accessed from abstract classes
		System.out.println("Drink is over");
	}
	
	
	
}
