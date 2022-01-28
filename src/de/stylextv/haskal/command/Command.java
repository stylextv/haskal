package de.stylextv.haskal.command;

import de.stylextv.haskal.command.argument.ArgumentList;

public abstract class Command {
	
	private String name;
	
	public Command(String name) {
		this.name = name;
	}
	
	public abstract void execute(ArgumentList list);
	
	public String getName() {
		return name;
	}
	
}
