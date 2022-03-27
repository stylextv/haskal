package de.stylextv.haskal.game.board.property.properties;

import de.stylextv.haskal.game.board.property.BoardProperty;

public class PlyProperty extends BoardProperty {
	
	@Override
	public void onMoveMake(int move) {
		int ply = getValue();
		
		setValue(ply + 1);
	}
	
	@Override
	public void onMoveUnmake(int move) {
		int ply = getValue();
		
		setValue(ply - 1);
	}
	
}
