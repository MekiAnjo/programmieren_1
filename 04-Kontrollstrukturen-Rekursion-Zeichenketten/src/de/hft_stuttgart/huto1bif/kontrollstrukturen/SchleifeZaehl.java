package de.hft_stuttgart.huto1bif.kontrollstrukturen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SchleifeZaehl {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.print("Summe von 1 bis ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer zahl;

		zahl = Integer.valueOf(br.readLine());

		int summe = 0;
		for (int counter = 1; counter <= zahl; counter++) {
			summe += counter;
		}
		System.out.println("Summe von 1 bis " + zahl + ": " + summe);

	}

}
