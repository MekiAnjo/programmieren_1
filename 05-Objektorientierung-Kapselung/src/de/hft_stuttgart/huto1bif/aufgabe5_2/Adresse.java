package de.hft_stuttgart.huto1bif.aufgabe5_2;

public class Adresse {

	private String ort;
	private String plz;
	private String strasse;

	public Adresse(String ort, String plz, String strasse) {
		this.ort = ort;
		this.plz = plz;
		this.strasse = strasse;
	}

	public String getOrt() {
		return ort;
	}

	public String getPlz() {
		return plz;
	}

	public String getStrasse() {
		return strasse;
	}

}
