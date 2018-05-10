package com.diviso.domain;

public class Board {
	
	private Player player;

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Player createPlayerInstance() {
		System.out.println("In instance factory method");
		return new Player();
	}
	public Board() {
		// TODO Auto-generated constructor stub
		System.out.println("Board constructor");
	}
	public void status() {
		// TODO Auto-generated method stub
		System.out.println("Board status is created through static factory method ");
		player.status();
	}

	
	
}
