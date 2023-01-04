package test_system;

public class SmartEnabledPhone extends FeaturePhone implements SmartFeature {

public SmartEnabledPhone() {
	//System.out.println("....SmartEnabledPhone....");
}
	@Override
	public void installApp() {
		// TODO Auto-generated method stub
		System.out.println("App is installing.");
		
	}
	
	//overriding
	@Override
	public void switchOn(Boolean bootMode) {
		System.out.print(this.getClass()+"\t");
		System.out.println("Switching On in boot? " +bootMode);
	}

}
