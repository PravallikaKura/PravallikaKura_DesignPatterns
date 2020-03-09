package com.epam.structural_patterns;

public class DecoratorPatternTest {

	public static void main(String[] args) {
		House house1 = new TwoStoreyHouse(new BasicHouse());
		house1.build();
		System.out.println();
		
		House house2 = new ThreeStoreyHouse(new ThreeStoreyHouse(new BasicHouse()));
		house2.build();

	}

}
