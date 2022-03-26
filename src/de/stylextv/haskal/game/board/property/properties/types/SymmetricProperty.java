package de.stylextv.haskal.game.board.property.properties.types;

import de.stylextv.haskal.game.board.property.BoardProperty;

public abstract class SymmetricProperty extends BoardProperty {
	
	public abstract void onMove();
	
	@Override
	public void onMoveMake() {
		onMove();
	}
	
	@Override
	public void onMoveUnmake() {
		onMove();
	}
	
}
