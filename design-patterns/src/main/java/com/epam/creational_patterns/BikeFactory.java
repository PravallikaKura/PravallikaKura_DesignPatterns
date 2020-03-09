package com.epam.creational_patterns;


public class BikeFactory {
	public static Bikes getBike(String bikeType){
	      if(bikeType == null){
	         return null;
	      }		
	      if(bikeType.equalsIgnoreCase("KTM")){
	         return new KTM();
	         
	      } else if(bikeType.equalsIgnoreCase("HeroHonda")){
	         return new HeroHonda();
	         
	      } else if(bikeType.equalsIgnoreCase("Activa")){
	         return new Activa();
	      }
	      
	      return null;
	   }

}
