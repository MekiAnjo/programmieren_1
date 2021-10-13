package de.hft_stuttgart.huto1bif.rekursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummeRekursiv2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.print("Summe von 1 bis ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer zahl;

		zahl = Integer.valueOf(br.readLine());
		
		Integer summe = summe(zahl);

		System.out.println("Summe von 1 bis " + zahl + ": " + summe);

	}

	private static Integer summe(Integer i) {
		if (i.equals(1)) {
			return 1;
		} else {
			return i + summe(i-1);
		}
	}

}
