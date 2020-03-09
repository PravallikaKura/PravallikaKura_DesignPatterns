package com.epam.structural_patterns;

public class TwoStoreyHouse  extends HouseDecorator{

	public TwoStoreyHouse(House h) {
		super(h);
		// TODO Auto-generated constructor stub
	}
	
	
  public void build(){
	  super.build();
	  System.out.println("Adding two storeys of building");
  }
}
