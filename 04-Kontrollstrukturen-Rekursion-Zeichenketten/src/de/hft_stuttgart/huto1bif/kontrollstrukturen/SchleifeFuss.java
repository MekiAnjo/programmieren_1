package de.hft_stuttgart.huto1bif.kontrollstrukturen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SchleifeFuss {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.print("Summe von 1 bis ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer zahl;
	
		zahl =  Integer.valueOf(br.readLine());
		
		int counter = 1;
		int summe = 0;
		
		do {
			summe += counter;
			counter++;
		} while (counter <= zahl);
		
		System.out.println("Summe von 1 bis " + zahl + ": " + summe);

	}

}
