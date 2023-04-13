package com.in28minutes.learnspringframework.game;

public class GameRunner {
	
	private superContraGame game;
	
	public GameRunner(superContraGame game) {
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
