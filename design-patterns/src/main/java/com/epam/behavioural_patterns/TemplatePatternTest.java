package com.epam.behavioural_patterns;

public class TemplatePatternTest {

	public static void main(String[] args){
	SchoolTemplate schooltype = new PrimarySchool();
	
	schooltype.buildSchool();
	
	

	schooltype = new HighSchool();
	
	schooltype.buildSchool();
	
	
}
}