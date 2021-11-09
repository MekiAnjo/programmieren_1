package de.hft_stuttgart.huto1bif.umlShop;

import java.util.Date;
import java.util.Scanner;

public class Main {

  private static final Scanner SCAN = new Scanner(System.in);
  private static final String TRENN_STRING = "=".repeat(75);
  private static final double TAX = 19;

  public static void main(String[] args) {
    Rechnung meineRechnung = new Rechnung(new Date(2009 + 1900, 4 - 1, 1));

    Artikel kaffeePot = new Artikel("Kaffee-Pot", 5.00);
    meineRechnung.addArtikel(kaffeePot);
    meineRechnung.addArtikel(kaffeePot);
    meineRechnung.addArtikel(kaffeePot);
    meineRechnung.addArtikel(new Artikel("Reisewecker", 19.50));
    meineRechnung.addArtikel(new Artikel("Stehlampe", 114.50));

    Kunde alex = new Kunde(meineRechnung);
    System.out.println("Alex seine Kundennummer: " + alex.getKundennummer());
    System.out.println();

    System.out.println("Bitte geben Sie Ihre Kundennummer ein");
    System.out.println("Zum Beenden geben Sie 'exit' ein!");
    String input = SCAN.next();
    if (input.equals("exit")) {
      System.out.println("BYE!");
      System.exit(0);
    }
    int kundennummer = Integer.parseInt(input);
    System.out.println(TRENN_STRING);
    System.out.println("Rechung vom:\t" + alex.getRechnung().getDate());
    System.out.println("Ihre Kunden-Nr:\t" + alex.getKundennummer());
    System.out.println(
      "Rechnungs-Nr:\t" + alex.getRechnung().getRechnungsNummer()
    );
    System.out.println();
    System.out.println("Bestelldatum:\t 1.4.2009");
    System.out.println(
      "Artikelnr.\tArtikelbezeichnung\tAnzahl\tEinzelpreis\tGesamtpreis"
    );
    double sum = 0;
    for (Artikel artikel : alex.getRechnung().getArtikelList()) {
      StringBuilder output = new StringBuilder();
      sum += artikel.getPreis();

      output.append(artikel.getNummer());
      output.append("\t");
      output.append(artikel.getBezeichnung());
      output.append("\t");
      output.append(3);
      output.append("\t");
      output.append(artikel.getPreis());
      output.append("\t");
      output.append(artikel.getPreis());

      System.out.println(output.toString());
    }
    System.out.println();
    System.out.println("Gesamtbetrag EUR:\t" + sum);
    System.out.println();
    System.out.printf(
      "Der Rechnungbetrag enthält 19 %% Mehrwertsteurer = %.2f EUR%n",
      sum / (TAX + 100) * TAX
    );
    System.out.println("Wir danken für Ihren Auftrag.");
    System.out.println(TRENN_STRING);
  }
}
