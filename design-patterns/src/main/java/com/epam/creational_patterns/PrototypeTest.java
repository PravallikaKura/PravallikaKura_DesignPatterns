package com.epam.creational_patterns;

import java.util.List;
public class PrototypeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
	  Volunteers vols = new Volunteers();
	  vols.loadData();
	  
	  Volunteers volsNew = (Volunteers) vols.clone();
	  Volunteers volsNew1 = (Volunteers) vols.clone();
		List<String> list = volsNew.getvolunteerList();
		list.add("Jay");
		List<String> list1 = volsNew1.getvolunteerList();
		list1.remove("Amit");
		
		System.out.println("vols List: "+vols.getvolunteerList());
		System.out.println("volsNew List: "+list);
		System.out.println("volsNew1 List: "+list1);
	
	
	}
}
