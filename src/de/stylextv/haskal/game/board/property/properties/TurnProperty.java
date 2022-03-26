package de.stylextv.haskal.game.board.property.properties;

import de.stylextv.haskal.game.board.property.properties.types.SymmetricProperty;
import de.stylextv.haskal.game.piece.PieceColor;

public class TurnProperty extends SymmetricProperty {
	
	@Override
	public void onMove() {
		int color = getValue();
		
		color = PieceColor.opposite(color);
		
		setValue(color);
	}
	
}
