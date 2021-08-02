package de.hft_stuttgart.huto1bif;

import java.util.Arrays;
import java.util.Scanner;

public class Primzahlen {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(
      "Bitte geben Sie an, wie viele Primzahlen berechnet werden sollen: "
    );
    int n = scanner.nextInt();
    scanner.close();

    // Array für die gewünschte Anzahl Primzahlen anlegen
    int[] primzahlen = new int[n];

    // Wie viele Primzahlen wurden bereits gefunden?
    int anzahlPrimzahlen = 0;

    // Zahl 2 ist prim, besteht aber den Teilertest %2
    // daher vorab eintragen
    primzahlen[anzahlPrimzahlen] = 2;
    anzahlPrimzahlen++;

    // kleinste Zahl, ab der zu suchen ist: 3
    int zahl = 3;

    // Äußere Schleife läuft, bis die gewünschte Menge
    // Primzahlen gefunden wurde, und zählt die zu testende
    // Zahl hoch
    while (anzahlPrimzahlen < n) {
      boolean istPrim = true;
      int teiler = 2;

      // Innere Schleife zählt für die aktuell zu testende
      // Zahl den Teiler hoch, um Teilbarkeit durch alle
      // kleineren Zahlen zu prüfen

      while (teiler < zahl) {
        // Teiler gefunden! Vermerken, dass
        // zahl nicht prim ist.
        if ((zahl % teiler) == 0) { //zahlen sind nicht teilerfremd!
          istPrim = false;
        }

        teiler++;
      }
      // Innere Schleife wurde beendet. Primzahl gefunden?
      // Dann speichern und Anzahl gefundener Primzahlen
      // hochzählen.
      if (istPrim) {
        primzahlen[anzahlPrimzahlen] = zahl;
        anzahlPrimzahlen++;
      }
      // Nächste zu prüfende Zahl ermitteln.
      zahl++;
    }

    System.out.println(Arrays.toString(primzahlen));
  }
}
