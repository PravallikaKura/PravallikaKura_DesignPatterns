package com.epam.behavioural_patterns;

public class FridgeAction  implements State {
	private State fridgeState;
	
	public void setState(State state) {
		this.fridgeState=state;
	}
	public State getState() {
		return this.fridgeState;
	}
	public void doAction() {
		this.fridgeState.doAction();
	}
}
