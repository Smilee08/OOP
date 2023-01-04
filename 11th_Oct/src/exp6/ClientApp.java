package exp6;

import test_system.FeaturePhone;
import test_system.MobilePhone;
import test_system.SmartEnabledPhone;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone m=new FeaturePhone();
		System.out.println(m.getClass());
		m.makeACall();//overridding
		System.out.println();
		
		MobilePhone m2=new SmartEnabledPhone();
		System.out.println(m2.getClass()); 
		m2.makeACall();//overriding
		System.out.println();
		
		FeaturePhone f=new FeaturePhone();
		//System.out.println("FeaturePhone:");
		f.switchOn(true);
		f.switchOn();
		f.makeACall();
		System.out.println();
	
		
		SmartEnabledPhone s=new SmartEnabledPhone();
		//System.out.println("SmartEnabledPhone:");
		System.out.println("No of sims:"+s.max_no_of_sim);
		s.switchOn(true);
		s.switchOn();
		s.installApp();
		s.makeACall();
		System.out.println();
		
		FeaturePhone fs=new SmartEnabledPhone();
		fs.switchOn(true); //overriding 
		fs.switchOn();
		fs.makeACall();
		
		


	}

}
