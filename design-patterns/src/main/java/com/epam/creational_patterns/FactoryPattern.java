package com.epam.creational_patterns;


public class FactoryPattern {
	public static void main(String[] args) {
	      BikeFactory bikesFactory = new BikeFactory();

	      
	      Bikes bike1 = BikeFactory.getBike("KTM");

	      bike1.book();
	     
	      
	      Bikes bike2 = BikeFactory.getBike("Activa");

	      
	      bike2.book();
	      
	      
	      Bikes bike3 = BikeFactory.getBike("HeroHonda");

	      bike3.book();
	      
	   }

}
