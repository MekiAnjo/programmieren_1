package autohaus;

import java.util.Random;

public class Autohaus {

  private static final String[] AUDI_AUSWAHL = {
    "A1",
    "A2",
    "A3",
    "A4",
    "A5",
    "A6",
    "A7",
    "RS3",
    "RS4",
    "RS5",
  };

  private static final String[] BMW_AUSWAHL = {
    "M1",
    "M2",
    "M3",
    "M4",
    "M5",
    "M6",
  };

  private static int anzahlAutos = 0;
  private int anzahl = 0;

  private static final Random RAND = new Random();

  public static void main(String[] args) {
    Autohaus fidler = new Autohaus();
    Autohaus gasche = new Autohaus();

    for (int i = 0; i < 10; i++) {
      BMW bmw = new BMW(
        BMW_AUSWAHL[randomIndex(BMW_AUSWAHL.length)],
        450,
        2020,
        true,
        anzahlAutos++
      );
    }
    for (int i = 0; i < 10; i++) {
      Audi audi = new Audi(
        AUDI_AUSWAHL[randomIndex(AUDI_AUSWAHL.length)],
        120,
        2019,
        "Leder",
        gasche.anzahl++
      );
    }
  }

  private static int randomIndex(int length) {
    return RAND.nextInt(length);
  }
}
