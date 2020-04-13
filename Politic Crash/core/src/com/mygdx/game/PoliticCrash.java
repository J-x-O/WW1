package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import screens.MainMenuScreen;

public class PoliticCrash extends Game {
	public final static int Width = 1920;
	public final static int Height = 1080;
	public SpriteBatch batch;
	
	
	@Override
	public void create () {
		batch = new SpriteBatch(); //zeichnet Texturen (wird von jedem Screen verwendet)
		setScreen(new MainMenuScreen(this)); //Aufruf und Instanziieren des Hauptmenuscreens
	}
	
	@Override
	public void dispose () {
	
	}
}
