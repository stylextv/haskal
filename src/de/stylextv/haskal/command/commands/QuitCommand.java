package de.stylextv.haskal.command.commands;

import de.stylextv.haskal.command.Command;
import de.stylextv.haskal.command.InputController;
import de.stylextv.haskal.command.argument.ArgumentList;

public class QuitCommand extends Command {
	
	public QuitCommand() {
		super("quit");
	}
	
	@Override
	public void execute(ArgumentList list) {
		InputController.stop();
	}
	
}
