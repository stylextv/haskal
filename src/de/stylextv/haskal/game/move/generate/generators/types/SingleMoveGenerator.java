package de.stylextv.haskal.game.move.generate.generators.types;

import de.stylextv.haskal.game.board.Board;
import de.stylextv.haskal.game.move.generate.MoveGenerator;
import de.stylextv.haskal.game.move.list.MoveList;

public abstract class SingleMoveGenerator extends MoveGenerator {
	
	public abstract void generateMoves(Board board, int square, MoveList list);
	
	@Override
	public void generateMoves(Board board, MoveList list) {
		
	}
	
}
