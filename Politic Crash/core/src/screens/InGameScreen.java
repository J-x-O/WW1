package screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.mygdx.game.PoliticCrash;

public class InGameScreen implements Screen{
	
	PoliticCrash game;
	
	public InGameScreen(PoliticCrash game) { //Konstruktor
		this.game = game;
		
		//Alle Länder erstellen
		//SkilltreeScreen inizialisieren
		
		
	}

	public void show() {
		
	}

	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1); //Screenclear Füllfarbe Weiß
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); //Screenclear mit festgelegter Farbe
		game.batch.begin();
		
		game.batch.end();
	}

	public void resize(int width, int height) {
		
	}

	public void pause() {
		
	}

	public void resume() {
		
	}

	public void hide() {
		
	}

	public void dispose() {
		
	}

}
