package com.mygdx.game.desktop;

import com.mygdx.game.PoliticCrash;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.PoliticCrash;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = PoliticCrash.Width;
		config.height = PoliticCrash.Height;
		config.fullscreen = true;
		config.resizable = false;
		new LwjglApplication(new PoliticCrash(), config);
	}
}
