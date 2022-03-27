package de.stylextv.haskal.game.move;

import de.stylextv.haskal.game.serialize.Serializer;

public class MoveType {
	
	
	
	public static int ofPiece(int piece) {
		return Serializer.MOVE.getComponent(piece, Serializer.MOVE_TYPE);
	}
	
}
