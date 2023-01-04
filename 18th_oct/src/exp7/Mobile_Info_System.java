package exp7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mobile_Info_System {
	
	private List<Mobile> l;

	
	public Mobile_Info_System() {
		System.out.println(".....Mobile info system...");
	}
	
	
	public List<Mobile> getL() {
		return l;
	}

	public void setL(List<Mobile> l) {
		this.l = l;
	}



	public Map<String,Mobile> List_By_brand(String brand_name) {
		System.out.println("Brand:"+brand_name);
		Integer i;
		Map<String, Mobile> m=null;
		for(i=0;i<l.size();i++) {
			if(l.get(i).getBrand_name()==brand_name) {
				m=(Map<String, Mobile>) l.get(i);
			}
		}
		m=new HashMap<String,Mobile>();
		m.put(brand_name,(Mobile) m);
		return m;
	
		
	}
	
	public  Map<String,Mobile> allmobile() {
		
		
		return null;

	}
	
	public Map<String,Mobile> price(Boolean b,Integer amt) {
		
		System.out.println("Price greater then 50000");
		if(amt>50000) {
			System.out.println("True  Price:"+amt);
			
		}else {
			System.out.println("False Price:"+amt);
		}
		return null;
		

		
	}
	
	
	public List<Mobile> filter() {
		
		List<Mobile> mobile=null;
		
		
		
	/*	Map<String,Mobile> map=new HashMap<String,Mobile>();
		map.put("Samsung Galaxy J5",(Mobile) mobile);
	
		for (Map.Entry<String,Mobile> entry : map.entrySet())  
		{  
		
		System.out.println("Item: " + entry.getKey() + ", Price: " + entry.getValue());   
		} */

	return mobile;
		
	}


	

}
