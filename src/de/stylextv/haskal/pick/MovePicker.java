package de.stylextv.haskal.pick;

import de.stylextv.haskal.game.board.Board;

public abstract class MovePicker {
	
	
	
	private static final MovePicker[] PICKERS = new MovePicker[] {
			
	};
	
	public abstract void pickMove();
	
	public static int pickMove(Board board) {
		
	}
	
	public static MovePicker[] getPickers() {
		return PICKERS;
	}
	
}
