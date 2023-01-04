package exp4;

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

	static void consumed() {
		System.out.println("Drink is over");
	}
	
	
	
}
