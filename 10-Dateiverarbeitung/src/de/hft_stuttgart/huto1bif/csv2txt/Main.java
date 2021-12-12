package de.hft_stuttgart.huto1bif.csv2txt;

import java.io.File;

public class Main {

  public static void main(String[] args) {
    // KundenCSV2Aufkleber konvertierer = new KundenCSV2AufkleberIO();
    KundenCSV2Aufkleber konvertierer = new KundenCSV2AufkleberNIO();
    // konvertierer.konvertiereKundendaten(
    //   new File("kundendaten.csv"),
    //   new File("kundendaten.txt")
    // );

    // Zum herausfinden wo der root folder ist
    // File file = new File(".");
    // for (String fileNames : file.list()) System.out.println(fileNames);
    konvertierer.konvertiereKundendaten(
      new File(
        "10-Dateiverarbeitung\\src\\de\\hft_stuttgart\\huto1bif\\csv2txt\\kundendaten.csv"
      ),
      new File("kundendaten.txt")
    );
  }
}
