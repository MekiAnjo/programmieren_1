package de.hft_stuttgart.huto1bif.wiederholung_arrays.wochentage;

public class Wochentage_schwieriger {

  public static void main(String[] args) {
    String[] wochentage = new String[] {
      "Montag",
      "Dienstag",
      "Mittwoch",
      "Donnerstag",
      "Freitag",
      "Zusatztag1",
      "Zusatztag2",
      "Zusatztag3",
      "Samstag",
      "Sonntag",
    };

    for (int i = 0; i < wochentage.length; i++) {
      System.out.printf("%2d. %s%n", i + 1, wochentage[i]);
    }
  }
}
