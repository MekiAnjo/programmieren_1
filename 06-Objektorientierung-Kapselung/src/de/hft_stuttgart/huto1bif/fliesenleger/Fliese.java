package de.hft_stuttgart.huto1bif.fliesenleger;

public class Fliese {
	
	private int kantenLaenge;

	public Fliese(int kantenLaenge) {
		super();
		this.kantenLaenge = kantenLaenge;
	}

	public int getKantenLaenge() {
		return kantenLaenge;
	}

	@Override
	public String toString() {
		return "Fliese mit Kantenlaenge=" + kantenLaenge;
	}

}
