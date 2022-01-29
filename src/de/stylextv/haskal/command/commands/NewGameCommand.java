package de.stylextv.haskal.command.commands;

import de.stylextv.haskal.command.Command;
import de.stylextv.haskal.command.message.Message;

public class NewGameCommand extends Command {
	
	public NewGameCommand() {
		super("ucinewgame");
	}
	
	@Override
	public void execute(Message m) {}
	
}
