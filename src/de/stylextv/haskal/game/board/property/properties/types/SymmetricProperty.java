package de.stylextv.haskal.game.board.property.properties.types;

import de.stylextv.haskal.game.board.property.BoardProperty;

public abstract class SymmetricProperty extends BoardProperty {
	
	public abstract void onMove(int move);
	
	@Override
	public void onMoveMake(int move) {
		onMove(move);
	}
	
	@Override
	public void onMoveUnmake(int move) {
		onMove(move);
	}
	
}
