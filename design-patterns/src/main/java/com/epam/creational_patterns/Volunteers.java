package com.epam.creational_patterns;
import java.util.ArrayList;
import java.util.List;


public class Volunteers implements Cloneable{

	private List<String> volunteerList;
	
	public Volunteers(){
		volunteerList = new ArrayList<String>();
	}
	
	public Volunteers(List<String> list){
		this.volunteerList=list;
	}
	public void loadData(){
		volunteerList.add("Pravallika");
		volunteerList.add("PrudhveRaj");
		volunteerList.add("Priyanka");
		volunteerList.add("Monalisa");
	}
	
	public List<String> getvolunteerList() {
		return volunteerList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getvolunteerList()){
				temp.add(s);
			}
			return new Volunteers(temp);
	}
	
}