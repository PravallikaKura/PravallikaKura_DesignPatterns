package com.epam.structural_patterns;

public class BridgePatternTest {
	
	public static void main(String[] args) {
	
	
	Shape rect = new Rectangle(new BlueColor());
	rect.applyColor();
	
	Shape sq = new Square(new GreenColor());
	sq.applyColor();

}
}
