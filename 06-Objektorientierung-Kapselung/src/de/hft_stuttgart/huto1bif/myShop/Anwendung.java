package de.hft_stuttgart.huto1bif.myShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anwendung {

  private static final int MAX_KUNDEN = 10;
  private static final int MAX_ARTIKEL = 10;
  private static final int MAX_AUFTRAEGE = 10;

  Kunde[] kunden = new Kunde[MAX_KUNDEN];
  Artikel[] artikel = new Artikel[MAX_ARTIKEL];
  Auftrag[] auftraege = new Auftrag[MAX_AUFTRAEGE];

  private void initialisierung() {
    Kunde k1 = new Kunde(
      1212,
      "Dr. Hans Müller",
      new Adresse("Blumenallee", 14, 23456, "Irgendwo")
    );

    Artikel artikel1 = new Artikel(2137, "Kaffee-Pot", 5.0);
    Artikel artikel2 = new Artikel(2141, "Reisewecker", 19.5);
    Artikel artikel3 = new Artikel(2394, "Stehlampe", 114.5);

    Auftrag a1 = new Auftrag(k1, 2323, "1.4.2009", "3.4.2009", 3);
    a1.positionHinzufuegen(new Position(artikel1, 3));
    a1.positionHinzufuegen(new Position(artikel2, 1));
    a1.positionHinzufuegen(new Position(artikel3, 1));

    kunden[0] = k1;
    artikel[0] = artikel1;
    artikel[1] = artikel2;
    artikel[2] = artikel3;

    auftraege[0] = a1;
  }

  private void eingabeSteuern() {
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(in);
    System.out.println("Bitte geben Sie Ihre Kundennummer ein");
    System.out.println("Zum Beenden geben Sie 'exit' ein!");
    try {
      String input = buffer.readLine();
      if (input.equals("exit")) {
        System.out.println("Programm beendet");
        return;
      }
      int nummer = Integer.parseInt(input);
      for (int i = 0; i < auftraege.length; i++) {
        if (auftraege[i] == null) {
          break;
        }
        int nr = auftraege[i].getKunde().getNummer();
        if (nr == nummer) drucken(auftraege[i]);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void drucken(Auftrag auftrag) {
    auftrag.drucken();
  }

  public static void main(String[] args) {
    Anwendung anw = new Anwendung();
    anw.initialisierung();
    anw.eingabeSteuern();
  }
}
