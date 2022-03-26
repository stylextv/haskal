package de.stylextv.haskal.game.board.property;

public abstract class BoardProperty {
	
	private int value;
	
	public abstract void onMoveMake();
	
	public abstract void onMoveUnmake();
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
}
