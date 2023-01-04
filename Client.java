import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import laptopdb.Laptop;
import laptopdb.Laptop_Database;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop_Database ldb = new Laptop_Database();
		
				
	   HashMap<String,Laptop> m1 = new HashMap<String,Laptop>(){
		   {
			   put("Laptop1", new Laptop("Lenovo","LV928",54000,14,"250GB","SSD","Windows10"));
			   put("Laptop2", new Laptop("HP","HP0928",40000,11,"128GB","HDD","Windows8"));
		   }
	   };
		
		
		
	ldb.listAllLaptops(m1);
	
		
	}

}
