package com.epam.behavioural_patterns;

public class HighSchool extends SchoolTemplate {

	@Override
	public void buildPillars() {

		System.out.println("Building School Pillars with Cement for High School");
		
	}

	@Override
	public void buildWindows() {
		System.out.println("Building School Windows with Wood for High School");
	
	}

}
