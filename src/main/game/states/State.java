package main.game.states;

import java.awt.Graphics;

public abstract class State {
	
	private static State currentState = null;
	
	public void setState(State state){
		currentState = state;
	}
	
	public static State getState(){
		return currentState;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);

}
