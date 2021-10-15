package de.hft_stuttgart.huto1bif.aufgabe5_3;

public class Bruchrechner {
	
	public static void main(String[] args) {
		Bruch a = new Bruch(1, 2);
		Bruch b = new Bruch(3, 4);

		System.out.println(a);
		System.out.println(b);

		
		Bruch c = a.addiere(b);
		System.out.println(c);

		System.out.println(a.subtrahiere(b));
		System.out.println(a.multipliziere(b));
		System.out.println(a.dividiere(b));
	}
}

