package text;

import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exp1.DB;
import exp1.Data_Store;
import exp1.Data_load;
import exp1.Mobile;

public class ClientApp {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Data_load d;
		d=new Data_load();
		System.out.println("Input file:");
		List<Mobile> s=new ArrayList<>();
		s=d.load();
		
		//System.out.println("\nOutput file:\n");
		Data_Store ds=new Data_Store();
		ds.store(s);
		
		DB db=new DB();
		//db.queary();
		db.connect();
		
		db.insert(1, "S8", "Samsung", 10000);
	

	}

}
