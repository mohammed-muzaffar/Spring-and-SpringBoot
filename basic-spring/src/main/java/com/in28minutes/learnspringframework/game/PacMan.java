package com.in28minutes.learnspringframework.game;

public class PacMan implements GamingConsole{
	public void up() {
		System.out.println("Jump");
		System.out.println("PacMan Game Running");
	}
	
	public void down() {
		System.out.println("GO into a hole");
	}
	
	public void left() {
		System.out.println("Go back");
	}
	
	public void right() {
		System.out.println("Accelerate");
	}
}
