package objects;

public class Land {

	private final String name;
	private int vertrauen;
	private int informationen;
	private Skillbaum technologie;
	private Skillbaum regierung;
	private boolean vertrauenVerloren;
	private boolean erobert;
	
	public Land(String name, int vertrauen, int geklauteInformationen, Skillbaum technologie, Skillbaum regierung, boolean vertrauenVerloren, boolean erobert) { //Konstruktor
		this.name = name;
		this.vertrauen = vertrauen;
		this.informationen = geklauteInformationen;
		this.technologie = technologie;
		this.regierung = regierung;
		this.vertrauenVerloren = vertrauenVerloren;
		this.erobert = erobert;
	}
	
	public void vertrauenÄndern(int menge) {
		vertrauen = vertrauen + menge;
	}
	
	public void datenGenerieren() {
		int generierungsRate = 1;
		informationen+=generierungsRate;
	}
	
	public void datenKlauen(Land land) {
		
	}
}
