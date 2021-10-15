package de.hft_stuttgart.huto1bif.aufgabe5_2;

public class Kunde {

	private Adresse adresse;
	private String name;
	private String vorname;

	public Kunde(Adresse adresse, String name, String vorname) {
		this.adresse = adresse;
		this.name = name;
		this.vorname = vorname;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public String getName() {
		return name;
	}

	public String getVorname() {
		return vorname;
	}

}