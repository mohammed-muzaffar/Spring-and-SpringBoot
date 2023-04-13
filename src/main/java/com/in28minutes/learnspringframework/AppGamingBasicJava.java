package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.superContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		var marioGame = new MarioGame();
		var superContraGame = new superContraGame();
		var gameRunner = new GameRunner(superContraGame );
		gameRunner.run();
	}

}
