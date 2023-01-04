package laptopdb;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Laptop_Database {
	Laptop laptop=new Laptop();

	public Laptop_Database()
	{
	
	}
	
	
	public void listAllLaptops(HashMap<String,Laptop> lap)
	{
		for(HashMap.Entry<String,Laptop> m : lap.entrySet())
		{
			System.out.println(m.getKey()+":\n"+m.getValue());
		}
		
	}
	
	public void  listByBrand(HashMap<String,Laptop> lap,String brand)
	{
		for(HashMap.Entry<String,Laptop> m : lap.entrySet())
		{
			System.out.println(m.getKey()+":"+m.getValue().getBrand());
		}
	}
	
	

}
