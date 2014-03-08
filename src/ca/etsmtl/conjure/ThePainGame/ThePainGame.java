package ca.etsmtl.conjure.ThePainGame;

import ca.etsmtl.conjure.PwnEngine.PwnEngine;

public class ThePainGame {
	
	private static ThePainGame gameInstance;
	
	public static void main(String[] args)
	{
		ThePainGame.gameInstance = new ThePainGame();
	}
	
	
	private final PwnEngine eng;
	
	private ThePainGame()
	{
		if(ThePainGame.gameInstance != null)
			throw new RuntimeException("GameInstance is getting override");
		System.out.println("[INFO] Waypoint 1");
		
		this.eng = new PwnEngine();
	}
	
	

}
