package de.hft_stuttgart.huto1bif.aufgabe5_2;

public class Anwendung {

  public static void main(String[] args) {
    Kunde kunde1 = new Kunde(
      new Adresse("Am Waldeck", "55555", "Talstr. 24"),
      "Tr�b",
      "Kamila"
    );
    Kunde kunde2 = new Kunde(
      new Adresse("Talerort", "45565", "Hauptstr. 43"),
      "Walder",
      "Dirk"
    );
    Kunde kunde3 = new Kunde(
      new Adresse("Frankenwelt", "25223", "Ahornweg 67"),
      "Roseteiler",
      "Amelie"
    );
    Kunde[] kunden = new Kunde[] { kunde1, kunde2, kunde3 };

    for (int i = 0; i < kunden.length; i++) {
      System.out.println(String.format("*** Kunde Nr. %s ***", i + 1));
      System.out.println(
        "Kunde: " + kunden[i].getVorname() + " " + kunden[i].getName()
      );
      System.out.println(
        "Adresse: " +
        kunden[i].getAdresse().getStrasse() +
        ", " +
        kunden[i].getAdresse().getPlz() +
        " " +
        kunden[i].getAdresse().getOrt()
      );
    }
  }
}
