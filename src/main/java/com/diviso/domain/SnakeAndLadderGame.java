package com.diviso.domain;

public class SnakeAndLadderGame {

	
	private Board board;
	
	public SnakeAndLadderGame() {
		// TODO Auto-generated constructor stub
		
		System.out.println("In game constructor ");
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
	
	public static Board getBoardInstance(int number,String message,String args,boolean ags3) {
		System.out.println("In static factory method-----Number is "+number+" Message is "+message+" args is "+args+" args3 is "+ags3);
		
		return new Board();
	}
	
	public void launchGame() {
		System.out.println("______________________________Game Started_____________________________");
		board.status();
	}
}
