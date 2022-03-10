package de.stylextv.haskal.game.move.generate;

import de.stylextv.haskal.game.board.Board;
import de.stylextv.haskal.game.move.list.MoveList;

public abstract class MoveGenerator {
	
	public static final MoveGenerator PAWN = ;
	
	public static final MoveGenerator KNIGHT = ;
	
	public static final MoveGenerator KING = ;
	
	public static final MoveGenerator BISHOP = ;
	
	public static final MoveGenerator ROOK = ;
	
	private static final MoveGenerator[] GENERATORS = new MoveGenerator[] {
			PAWN, KNIGHT, KING, BISHOP, ROOK
	};
	
	public abstract void generateMoves(Board board, MoveList list);
	
	public static MoveList generateMoves(Board board) {
		MoveList list = ;
		
		for(MoveGenerator g : GENERATORS) {
			
			g.generateMoves(board, list);
		}
		
		return list;
	}
	
	public static MoveGenerator[] getGenerators() {
		return GENERATORS;
	}
	
}
