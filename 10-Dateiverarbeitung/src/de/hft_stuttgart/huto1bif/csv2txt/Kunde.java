package de.hft_stuttgart.huto1bif.csv2txt;

public class Kunde {
	
	private String anrede = null;
	private String vorname = null;
	private String nachname = null;
	private String strasse = null;
	private String plz = null;
	private String stadt = null;
	private String land = null;

	public Kunde(String anrede, String vorname, String nachname, String strasse, String plz, String stadt,
			String land) {
		super();
		this.anrede = anrede;
		this.vorname = vorname;
		this.nachname = nachname;
		this.strasse = strasse;
		this.plz = plz;
		this.stadt = stadt;
		this.land = land;
	}

	@Override
	public String toString() {
		return "Kunde [anrede=" + anrede + ", vorname=" + vorname + ", nachname=" + nachname + ", strasse=" + strasse
				+ ", plz=" + plz + ", stadt=" + stadt + ", land=" + land + "]";
	}

	public String getAnrede() {
		return anrede;
	}

	public void setAnrede(String anrede) {
		this.anrede = anrede;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

}
