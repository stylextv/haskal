package de.stylextv.haskal.command;

import de.stylextv.haskal.command.commands.GoCommand;
import de.stylextv.haskal.command.commands.InfoCommand;
import de.stylextv.haskal.command.commands.NewGameCommand;
import de.stylextv.haskal.command.commands.OptionCommand;
import de.stylextv.haskal.command.commands.PositionCommand;
import de.stylextv.haskal.command.commands.QuitCommand;
import de.stylextv.haskal.command.commands.ReadyCommand;
import de.stylextv.haskal.command.commands.StopCommand;
import de.stylextv.haskal.command.message.Message;

public class CommandManager {
	
	private static final Command[] COMMANDS = new Command[] {
			new PositionCommand(),
			new GoCommand(),
			new StopCommand(),
			new OptionCommand(),
			new NewGameCommand(),
			new ReadyCommand(),
			new InfoCommand(),
			new QuitCommand()
	};
	
	public static void parseMessage(Message m) {
		String name = m.getName();
		
		Command c = getCommand(name);
		
		if(c == null) {
			
			InputController.sendMessage("Unknown command: " + name);
			
			return;
		}
		
		c.execute(m);
	}
	
	public static Command getCommand(String name) {
		for(Command c : COMMANDS) {
			
			String s = c.getName();
			
			if(s.equalsIgnoreCase(name)) return c;
		}
		
		return null;
	}
	
}
