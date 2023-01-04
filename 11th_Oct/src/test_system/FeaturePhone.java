package test_system;

public class FeaturePhone extends MobilePhone {
	
	public FeaturePhone() {
		//System.out.println(".....FeaturePhone...........");
	}
	//overloading
	public void switchOn() {
		System.out.println("Switch on");
	}

	public void switchOn(Boolean bootMode) {
		System.out.print(this.getClass() + "\t");
		System.out.println("Switching On in boot?" +bootMode);
	}

	@Override
	public void makeACall() {
		// TODO Auto-generated method stub
		System.out.println("Make a call");
		
	}
}
