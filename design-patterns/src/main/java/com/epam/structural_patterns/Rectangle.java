package com.epam.structural_patterns;

public class Rectangle extends Shape {

	public Rectangle(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		System.out.println("Rectangle filled with color");
		color.applyColor();
	}

}
