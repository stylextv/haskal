package de.stylextv.haskal.game.board.property.properties;

import de.stylextv.haskal.game.board.property.BoardProperty;
import de.stylextv.haskal.game.board.property.properties.types.SymmetricProperty;
import de.stylextv.haskal.game.piece.PieceColor;

public class TurnProperty extends SymmetricProperty {
	
	private int color = PieceColor.WHITE;
	
	@Override
	public void onMove() {
		color = PieceColor.opposite(color);
	}
	
	public int getColor() {
		return color;
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	
}
