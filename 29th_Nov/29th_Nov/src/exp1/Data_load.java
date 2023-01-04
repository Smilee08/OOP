package exp1;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Data_load {
	
	List<Mobile> mobile=new ArrayList<>();
	File f_input;
	Scanner sc;
	
	public List<Mobile> load(){	
		try {
			f_input =new File("./inputfile.txt");
			//if(f_input.exists()) {
			//	System.out.println(f_input.getName()+ " exist\n");
			//}
			
			sc=new Scanner(f_input);
			
			while(sc.hasNextLine()) {
				String record=sc.nextLine();
			//	System.out.println(record);
			//}
				String record_file[]=record.split(",");
				mobile.add(new Mobile(record_file[0],record_file[1]));
			
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			for(Mobile m : mobile) {
				System.out.println(m.getBrand()+ " | " + m.getModel());
				
			}
		
		}
		return mobile;
	}
	
	
	
	public void using_FileReader() {
		
	}
}
