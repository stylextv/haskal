package de.stylextv.haskal.game.board.bitboard.bitboards;

public class PositionBitboard {
	
	
	
	public static long ofSquare(int square) {
		return 1l << square;
	}
	
}
