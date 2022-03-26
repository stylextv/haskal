package de.stylextv.haskal.game.piece;

import de.stylextv.haskal.game.serialize.SerializeObject;
import de.stylextv.haskal.game.serialize.Serializer;

public class PieceColor {
	
	public static final int WHITE = 1;
	public static final int BLACK = 2;
	
	public static final int NONE = SerializeObject.EMPTY;
	
	public static int ofPiece(int piece) {
		return Serializer.PIECE.getComponent(piece, Serializer.PIECE_COLOR);
	}
	
}
