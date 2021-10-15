package de.hft_stuttgart.huto1bif.fotos;

public class Anwendung {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Objektiv weit = new Objektiv(28, 50);
		FotoApparat fa = new FotoApparat("NieKon", 9, 7.5, true, weit);
		Objektiv zoom = new Objektiv(50, 200);
		Objektiv tasche = zoom;

		fa.machFoto(); // Klick mit (28,50)
		Objektiv tisch = fa.entferneObjektiv();

		fa.machFoto(); // *** Kein Objektiv an Kamera

		fa.setObjektiv(tasche);

		fa.machFoto(); // Klick mit (50,200)

		tasche = tisch;
		tisch = null;

		if (tisch == weit) {
			System.out.println("Weitwinkel liegt auf dem Tisch");
		} else if (tisch == zoom) {
			System.out.println("Zoom liegt auf dem Tisch");
		} else {
			System.out.println("Nichts liegt auf dem Tisch");
		}
	}

}
