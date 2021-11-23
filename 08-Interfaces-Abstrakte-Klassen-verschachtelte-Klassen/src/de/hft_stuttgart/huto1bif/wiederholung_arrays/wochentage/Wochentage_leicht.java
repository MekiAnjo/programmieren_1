package de.hft_stuttgart.huto1bif.wiederholung_arrays.wochentage;

public class Wochentage_leicht {

  public static void main(String[] args) {
    String[] wochentage = new String[] {
      "Montag",
      "Dienstag",
      "Mittwoch",
      "Donnerstag",
      "Freitag",
      "Samstag",
      "Sonntag",
    };

    for (int i = 0; i < wochentage.length; i++) {
      System.out.printf("%d. %s%n", i + 1, wochentage[i]);
    }
  }
}
