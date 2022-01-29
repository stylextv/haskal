package de.stylextv.haskal.command.commands;

import de.stylextv.haskal.command.Command;
import de.stylextv.haskal.command.InputController;
import de.stylextv.haskal.command.message.Message;

public class ReadyCommand extends Command {
	
	public ReadyCommand() {
		super("isready");
	}
	
	@Override
	public void execute(Message m) {
		InputController.sendMessage("readyok");
	}
	
}
