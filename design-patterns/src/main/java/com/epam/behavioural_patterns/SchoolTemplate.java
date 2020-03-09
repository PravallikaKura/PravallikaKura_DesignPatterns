package com.epam.behavioural_patterns;

public  abstract class SchoolTemplate {
	public final void buildSchool(){
		buildPlayGround();
		buildPillars();
		buildWindows();
		buildClassrooms();
		System.out.println("School is built.");
	}
	void buildClassrooms() {
		System.out.println("Building Digital Powered Classrooms");
	}
	public abstract void buildPillars();
	public abstract void buildWindows();
	private void buildPlayGround() {
		System.out.println("Building PlayGround with Badminton,Volleyball Courts");
	}
}

