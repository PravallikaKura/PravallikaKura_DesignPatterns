package com.epam.structural_patterns;

public abstract class Shape {
	
	protected Color color;
	
	public Shape(Color c){
		this.color=c;
	}
	
	abstract public void applyColor();
}