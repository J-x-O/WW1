package objects;

import com.badlogic.gdx.graphics.Texture;

public class Skill {

	public String name;
	public String beschreibung;
	public Texture icon;
	public boolean aktiv;
	
	public String getName() {
		return name;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public Texture getIcon() {
		return icon;
	}

	public boolean getAktiv() {
		return aktiv;
	}

}
