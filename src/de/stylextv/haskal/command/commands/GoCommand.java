package de.stylextv.haskal.command.commands;

import de.stylextv.haskal.command.Command;
import de.stylextv.haskal.command.InputController;
import de.stylextv.haskal.command.message.Message;
import de.stylextv.haskal.game.board.Board;
import de.stylextv.haskal.pick.MovePicker;

public class GoCommand extends Command {
	
	public GoCommand() {
		super("go");
	}
	
	@Override
	public void execute(Message m) {
		Board b = InputController.getBoard();
		
		int move = MovePicker.pickMove(b);
		
		
	}
	
}
