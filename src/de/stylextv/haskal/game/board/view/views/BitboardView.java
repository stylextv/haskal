package de.stylextv.haskal.game.board.view.views;

import de.stylextv.haskal.game.board.bitboard.bitboards.PositionBitboard;
import de.stylextv.haskal.game.board.view.BoardView;

public class BitboardView extends BoardView {
	
	private long[] bitboards = new long[];
	
	@Override
	public void removePiece(int square, int piece) {
		long bb = PositionBitboard.ofSquare(piece);
		
		bitboards[piece];
	}
	
	@Override
	public void setPiece(int square, int piece) {
		
	}
	
	public long getBitboard() {
		return ;
	}
	
}
