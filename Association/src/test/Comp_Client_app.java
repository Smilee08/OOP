package test;

import java.util.ArrayList;
import java.util.List;

import Composition.Mobile;
import Composition.MobileStore;

public class Comp_Client_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//compostionwhen there is an aggregation between 2 entities,the aggregate object can exist without the other entity but in the case of compostion object
		//cant exist
		Mobile m1=new Mobile("Readme6","8GB","128gb");
		Mobile m2=new Mobile("Readme6","8GB","128gb");
		Mobile m3=new Mobile("Readme6","8GB","128gb");

		List<Mobile> m=new ArrayList<Mobile>();
		m.add(m1);
		m.add(m2);
		m.add(m3);

		MobileStore store=new MobileStore(m);
		List<Mobile> mob=store.getTotalMobilesInStore();
		for(Mobile mb:mob) {
			System.out.println("Name:"+mb.getName()+" Ram:"+mb.getRam()+" Rom:"+mb.getRom());
		}
	}

}
