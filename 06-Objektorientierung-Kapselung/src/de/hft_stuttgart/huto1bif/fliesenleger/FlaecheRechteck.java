package de.hft_stuttgart.huto1bif.fliesenleger;

public class FlaecheRechteck {

	private int laenge;
	private int breite;

	public FlaecheRechteck(int laenge, int breite) {
		super();
		this.laenge = laenge;
		this.breite = breite;
	}

	public int anzahlFliesen(Fliese fliese) {
		int anzahlLaenge = laenge / fliese.getKantenLaenge();
		if (laenge % fliese.getKantenLaenge() > 0) {
			anzahlLaenge++;
		}
		int anzahlBreite = breite / fliese.getKantenLaenge();
		if (breite % fliese.getKantenLaenge() > 0) {
			anzahlBreite++;
		}
		return anzahlLaenge * anzahlBreite;
	}

	@Override
	public String toString() {
		String myFormat = "%-25s";
		return String.format(myFormat, "Abschnitt (" + laenge + "x" + breite + "): ");
	}

}
