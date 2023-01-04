package test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exp.Data_Store;
import exp.Data_load;
import exp.Mobile;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data_load d;
		d=new Data_load();
		System.out.println("Input file:");
		List<Mobile> s=new ArrayList<>();
		s=d.load();
		
		//System.out.println("\nOutput file:\n");
		Data_Store ds=new Data_Store();
		ds.store(s);
		
		
		
	

	}

}
