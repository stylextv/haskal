package de.stylextv.haskal.command;

public class CommandManager {
	
	public static final Command[] COMMANDS = new Command[] {
			
	};
	
	public static void parseMessage(String s) {
		
	}
	
	public static Command getCommand(String name) {
		for(Command c : COMMANDS) {
			
			String s = c.getName();
			
			if(s.equalsIgnoreCase(name)) return c;
		}
		
		return null;
	}
	
}
