package com.epam.structural_patterns;

public class HouseDecorator implements House {
	protected House house;
	

	public HouseDecorator(House h){
		this.house=h;
	}

	public void build() {
	   this.house.build();
		
	}
}
