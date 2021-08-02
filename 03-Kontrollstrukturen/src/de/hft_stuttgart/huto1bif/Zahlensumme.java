package de.hft_stuttgart.huto1bif;

public class Zahlensumme {

  public static void main(String[] args) {
    int index = 0;
    int summe = 0;

    // Summe aller Zahlen von 0 bis 5
    while (index < 6) {
      summe += index; // += ist kurz für summe = summe + indexs

      // Index erst ganz am Schluss des Schleifenkörpers erhöhen
      index++; // ++ ist kurz für index = index + 1
    }
    // In der Ausgabe kann man ebenfalls Operatoren verwenden, allerdings
    // muss der Ausdruck dann in Klammern
    System.out.println(
      "Die Summe aller Zahlen von 0 bis " + (index - 1) + " ist " + summe
    );
  }
}
