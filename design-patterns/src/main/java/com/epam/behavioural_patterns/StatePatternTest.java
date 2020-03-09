package com.epam.behavioural_patterns;

public class StatePatternTest {
	public static void main(String[] args) {
	
		FridgeAction action = new FridgeAction();
	    State fridgeONState = new FridgeONState();
	    State fridgeOFFState = new FridgeOFFState();
	    
	    action.setState(fridgeONState);
	    action.doAction();
	    
	    action.setState(fridgeOFFState);
	    action.doAction();
	
	
	

	}
	

}



