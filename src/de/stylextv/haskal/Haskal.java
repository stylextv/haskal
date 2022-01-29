package de.stylextv.haskal;

import de.stylextv.haskal.command.InputController;

public class Haskal {
	
	private static Haskal instance;
	
	public Haskal() {
		instance = this;
	}
	
	public void onStart() {
		InputController.sendMessage(Constants.VERSIONED_NAME + " by " + Constants.AUTHOR);
		
		InputController.start();
	}
	
	public static Haskal getInstance() {
		return instance;
	}
	
}
