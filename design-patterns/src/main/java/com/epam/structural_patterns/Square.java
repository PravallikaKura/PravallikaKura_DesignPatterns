package com.epam.structural_patterns;

public class Square extends Shape{

	public Square(Color c) {
		super(c);
		
	}

	@Override
	public void applyColor() {

		System.out.println("Square filled with color");
		color.applyColor();
		
	}
	


}
