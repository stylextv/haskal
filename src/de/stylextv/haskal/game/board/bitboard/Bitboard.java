package de.stylextv.haskal.game.board.bitboard;

import de.stylextv.haskal.game.board.square.BoardSquare;

public class Bitboard {
	
	public static final long EMPTY = 0;
	public static final long FULL = -1;
	
	public static long firstSquare(long bb) {
		return Long.numberOfTrailingZeros(bb);
	}
	
	public static long lastSquare() {
		int i = Long.numberOfLeadingZeros(EMPTY);
		
		return BoardSquare.H8 - i;
	}
	
	public static long squareCount(long bb) {
		return Long.bitCount(bb);
	}
	
	// TODO prevent over-/underflow
	public static long shift(long bb, int dir) {
		
		
		return dir < 0 ? bb >>> -dir : bb << dir;
	}
	
	public static long intersection(long bb1, long bb2) {
		return bb1 & bb2;
	}
	
	public static long union(long bb1, long bb2) {
		return bb1 | bb2;
	}
	
	public static long xor(long bb1, long bb2) {
		return bb1 ^ bb2;
	}
	
	public static long complement(long bb) {
		return ~bb;
	}
	
}
