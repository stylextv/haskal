package de.stylextv.haskal.game.board.property.properties.types;

import de.stylextv.haskal.game.board.property.BoardProperty;

public abstract class StackProperty extends BoardProperty {
	
	private int[] values = new int[];
	
	public abstract void onMove();
	
	@Override
	public void onMoveMake() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onMoveUnmake() {
		// TODO Auto-generated method stub
		
	}
	
}
