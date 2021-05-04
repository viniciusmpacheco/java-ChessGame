package main.java.game;

import main.java.board.Board;
import main.java.board.Piece;
import main.java.board.Position;
import main.java.game.enums.ChessColors;

public abstract class ChessPiece extends Piece {

	private ChessColors color;
	private int moveCount;

	public ChessPiece(Board board, ChessColors color) {
		super(board);
		this.color = color;
	}

	public ChessColors getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return moveCount;
	}
	
	public void increaseMoveCount() {
		moveCount++;
	}

	public void decreaseMoveCount() {
		moveCount--;
	}

	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
}