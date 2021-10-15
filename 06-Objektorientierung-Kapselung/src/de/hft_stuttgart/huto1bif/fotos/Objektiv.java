package de.hft_stuttgart.huto1bif.fotos;

public class Objektiv {
	
	private int brennweiteMin;
	private int brennweiteMax;

	public Objektiv(int brennweiteMin, int brennweiteMax) {
		this.setBrennweiten(brennweiteMin, brennweiteMax);
	}

	int getBrennweiteMin() {
		return brennweiteMin;
	}

	int getBrennweiteMax() {
		return brennweiteMax;
	}

	void setBrennweiten(int brennweiteMin, int brennweiteMax) {
		if (brennweiteMin < brennweiteMax) {
			this.brennweiteMin = brennweiteMin;
			this.brennweiteMax = brennweiteMax;
		} else {
			System.err.println("Die maximale Brennweite muss groesser als die minimale Brennweite sein.");
		}
	}
}
