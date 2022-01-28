package de.stylextv.haskal.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import de.stylextv.haskal.game.Game;

public class InputController {
	
	private static Game game;
	
	private static boolean active;
	
	public static void start() {
		try {
			
			active = true;
			
			onStart();
			
			InputStreamReader reader = new InputStreamReader(System.in);
			
			BufferedReader buffered = new BufferedReader(reader);
			
			while(active) {
				
				String s = buffered.readLine();
				
				if(s == null) break;
				
				CommandManager.parseMessage(s);
			}
			
			onStop();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void stop() {
		active = false;
	}
	
	private static void onStart() {
		
	}
	
	private static void onStop() {
		
	}
	
	public static Game getGame() {
		return game;
	}
	
	public static boolean isActive() {
		return active;
	}
	
}
