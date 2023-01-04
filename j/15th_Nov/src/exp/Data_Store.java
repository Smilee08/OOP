package exp;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Data_Store {
	List<Mobile> mobile=new ArrayList<>();
	PrintStream print;
	File f;
	
	public void store(List<Mobile> s){	
		try {
			File f_input;
			f_input =new File("./inputfile.txt");
			f=new File("./outfile.txt");
			if(f.exists()) {
				System.out.println("\n"+f.getName()+ " exist");
			}
			
			print=new PrintStream(f);
			mobile=s;

			
			//PrintStream console=System.out;
			//System.setOut(print);
			
			for(Mobile m : mobile) {
				print.print(m.getModel()+","+ m.getBrand()+"\n");

			}
			
			//System.setOut(print);
			print.close();
			//System.setOut(console);
			
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			System.out.println("successful");
		}
	}
	
}
