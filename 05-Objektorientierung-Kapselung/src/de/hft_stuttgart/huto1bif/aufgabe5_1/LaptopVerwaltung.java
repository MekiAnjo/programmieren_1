package de.hft_stuttgart.huto1bif.aufgabe5_1;

public class LaptopVerwaltung {

	public static void main(String[] args) {

		Laptop l1 = new Laptop("Dell", "Laura");
		System.out.println("Laptop: " + l1.getModell() + ", Benutzer: " + l1.getBenutzer() + ", ID: " + l1.getId());
		System.out.println("Gesamtanzahl: " + Laptop.getGesamtAnzahl());

		Laptop l2 = new Laptop("Lenovo", "Simon");
		System.out.println("Laptop: " + l1.getModell() + ", Benutzer: " + l1.getBenutzer() + ", ID: " + l1.getId());
		System.out.println("Laptop: " + l2.getModell() + ", Benutzer: " + l2.getBenutzer() + ", ID: " + l2.getId());
		System.out.println("Gesamtanzahl: " + Laptop.getGesamtAnzahl());

	}

}
