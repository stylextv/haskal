package de.stylextv.haskal.command.commands;

import de.stylextv.haskal.Constants;
import de.stylextv.haskal.command.Command;
import de.stylextv.haskal.command.InputController;
import de.stylextv.haskal.command.message.Message;

public class InfoCommand extends Command {
	
	public InfoCommand() {
		super("uci");
	}
	
	@Override
	public void execute(Message m) {
		InputController.sendMessage("id", "name", Constants.VERSIONED_NAME);
		InputController.sendMessage("id", "author", Constants.AUTHOR);
		
		
		
		InputController.sendMessage("uciok");
	}
	
}
