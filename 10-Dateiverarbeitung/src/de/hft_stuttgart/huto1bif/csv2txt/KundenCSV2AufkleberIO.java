package de.hft_stuttgart.huto1bif.csv2txt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class KundenCSV2AufkleberIO implements KundenCSV2Aufkleber {

	@Override
	public void konvertiereKundendaten(File quelle, File ziel) {

		try (BufferedWriter dateiSchreiber = new BufferedWriter(new FileWriter(ziel));
				BufferedReader dateiLeser = new BufferedReader(new FileReader(quelle));) {

			String eingabeZeile;
			String[] spalten = null;
			Kunde kunde = null;
			
			while ((eingabeZeile = dateiLeser.readLine()) != null) {
				if (!eingabeZeile.isEmpty()) {
					spalten = eingabeZeile.split(";");
					if (spalten.length != ANZAHL_SPALTEN) {
						System.err.println("Fehlerhafte Zeile: " + eingabeZeile);
						continue;
					}
					kunde = new Kunde(spalten[0], spalten[1], spalten[2], spalten[3], spalten[4], spalten[5],
							spalten[6]);

					System.out.println(kunde);

					dateiSchreiber.write("----------------------------------------");
					dateiSchreiber.write(System.lineSeparator());
					dateiSchreiber.write(System.lineSeparator());
					dateiSchreiber.write(kunde.getAnrede() + System.lineSeparator());
					dateiSchreiber.write(kunde.getVorname() + " " + kunde.getNachname() + System.lineSeparator());
					dateiSchreiber.write(kunde.getStrasse() + System.lineSeparator());
					dateiSchreiber.write(System.lineSeparator());
					dateiSchreiber
							.write(kunde.getPlz() + " " + kunde.getStadt().toUpperCase() + System.lineSeparator());
					dateiSchreiber.write(kunde.getLand().toUpperCase() + System.lineSeparator());
					dateiSchreiber.write(System.lineSeparator());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
