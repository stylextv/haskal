package de.stylextv.haskal.game.move.list;

public class MoveList {
	
	private static final int 
	
	private int[] moves;
	
	private int size;
	
	public MoveList() {
		this();
	}
	
	public MoveList(int size) {
		moves = new int[size];
	}
	
	public void clear() {
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public int[] getMoves() {
		return moves;
	}
	
}
