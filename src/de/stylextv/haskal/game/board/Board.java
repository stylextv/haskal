package de.stylextv.haskal.game.board;

import de.stylextv.haskal.game.board.view.BoardView;
import de.stylextv.haskal.game.board.view.views.BitboardView;
import de.stylextv.haskal.game.board.view.views.HashView;
import de.stylextv.haskal.game.board.view.views.PieceView;
import de.stylextv.haskal.game.board.view.views.SquareView;
import de.stylextv.haskal.game.piece.Piece;

public class Board {
	
	
	
	private SquareView squares = new SquareView();
	
	private PieceView pieces = new PieceView();
	
	private BitboardView bitboards = new BitboardView();
	
	private HashView hash = new HashView();
	
	private BoardView[] views = new BoardView[] {
			squares,
			pieces,
			bitboards,
			hash
	};
	
	// TODO make/unmake move
	
	public void movePiece(int from, int to) {
		int piece = getPiece(from);
		
		setPiece(to, piece);
		removePiece(from);
	}
	
	public void removePiece(int square) {
		int piece = getPiece(square);
		
		if(piece == Piece.NONE) return;
		
		for(BoardView view : views) {
			
			view.removePiece(square, piece);
		}
	}
	
	public void setPiece(int square, int piece) {
		removePiece(square);
		
		for(BoardView view : views) {
			
			view.setPiece(square, piece);
		}
	}
	
	public int getPieceSquare(int piece, int index) {
		return pieces.getPieceSquare(piece, index);
	}
	
	public int getPieceCount(int piece) {
		return pieces.getPieceCount(piece);
	}
	
	public int getPiece(int square) {
		return squares.getPiece(square);
	}
	
	public BoardView[] getViews() {
		return views;
	}
	
}
