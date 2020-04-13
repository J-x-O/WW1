package screens;

import com.mygdx.game.PoliticCrash;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

public class MainMenuScreen implements Screen{

	PoliticCrash game;
	Texture Button_StartNewGame;
	Texture Button_LoadGame;
	Texture Button_End;
	Texture Button_Credits;
	
	int WB4 = 800;	int WB3 = 800;	int WB2 = 600;	int WB1 = 400;
	int HB = 100;
	int abstand = 150; int space = 1080-4*abstand-400;
	int mittig = PoliticCrash.Width/2;
	
	public MainMenuScreen(PoliticCrash game) { //Konstruktor
		
		this.game = game;
		
		//Buttontexturen erstellen (Upload des PNG-Bildes zur GPU als Textur)
		Button_StartNewGame = new Texture("MainMenu/Button_StartNewGame.png");
		Button_LoadGame = new Texture("MainMenu/Button_LoadGame.png");
		Button_End = new Texture("MainMenu/Button_End.png");
		Button_Credits = new Texture("MainMenu/Button_Credits.png");
		
	}

	public void show() {
		
	}

	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1); //Screenclear Füllfarbe Weiß
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); //Screenclear mit festgelegter Farbe
		game.batch.begin();
		
		game.batch.draw(Button_StartNewGame, mittig-WB4/2, space+abstand*3, WB4, HB); //Button 1
		game.batch.draw(Button_LoadGame,	 mittig-WB3/2, space+abstand*2,	WB3, HB); //Button 2
		game.batch.draw(Button_End,			 mittig-WB2/2, space+abstand*1,	WB2, HB); //Button 3
		game.batch.draw(Button_Credits,		 mittig-WB1/2, space+abstand*0,	WB1, HB); //Button 4
		
		if (ButtonClicked(2)) {
			Gdx.app.exit();
		}
		
		if (ButtonClicked(4)) {
			game.setScreen(new InGameScreen(game));
		}

		game.batch.end();
	}
	
	private boolean ButtonClicked (int button) {
		boolean KeyPress = Gdx.input.isTouched();
		boolean Bottom = (PoliticCrash.Height-Gdx.input.getY())>space+(abstand*(button-1)); //GetY hat Koordinatenursprung Oben Links
		boolean Top = (PoliticCrash.Height-Gdx.input.getY())<space+HB+(abstand*(button-1)); //draw hingegen Unten Links, => Height-getY
		
		int Width;
		switch (button) {
		case 1:
			Width = WB1;
			break;
		case 2:
			Width = WB2;
			break;
		case 3:
			Width = WB3;
			break;
		case 4:
			Width = WB4;
			break;
		default:
			Width = 0;
		}
		
		boolean Left  = Gdx.input.getX()>mittig-(Width/2);
		boolean Right = Gdx.input.getX()<mittig+(Width/2);
		
		return KeyPress && Bottom && Top && Left && Right;			
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
