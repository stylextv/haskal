package de.stylextv.haskal.game.move.generate.generators.types;

import de.stylextv.haskal.game.board.Board;
import de.stylextv.haskal.game.move.generate.MoveGenerator;
import de.stylextv.haskal.game.move.list.MoveList;

public abstract class SetMoveGenerator extends MoveGenerator {
	
	public abstract void generateMoves(Board board, long bb, MoveList list);
	
	@Override
	public void generateMoves(Board board, MoveList list) {
		
	}
	
}
