package de.hft_stuttgart.huto1bif.csv2txt;

import java.io.File;

public class Main {

  public static void main(String[] args) {
    KundenCSV2Aufkleber konvertierer = new KundenCSV2AufkleberIO();
    //KundenCSV2Aufkleber konvertierer = new KundenCSV2AufkleberNIO();
    konvertierer.konvertiereKundendaten(
      new File("kundendaten.csv"),
      new File("kundendaten.txt")
    );
  }
}
