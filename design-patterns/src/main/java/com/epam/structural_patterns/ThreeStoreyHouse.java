package com.epam.structural_patterns;

public class ThreeStoreyHouse extends HouseDecorator {

	public ThreeStoreyHouse(House h) {
		super(h);
		// TODO Auto-generated constructor stub
	}
	
	public void build(){
		  super.build();
		  System.out.println("Adding three floors of building");
	  }

}
