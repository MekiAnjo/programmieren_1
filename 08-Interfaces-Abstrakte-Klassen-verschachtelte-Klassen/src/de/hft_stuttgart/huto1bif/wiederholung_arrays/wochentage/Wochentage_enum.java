package de.hft_stuttgart.huto1bif.wiederholung_arrays.wochentage;

import java.util.Arrays;
import java.util.List;

public class Wochentage_enum {

  public static void main(String[] args) {
    for (Wochentag wochentag : Wochentag.getListOfDays()) {
      System.out.printf(
        "%2d. %-10s Arbeitstag: %s%n",
        wochentag.getDayNumber(),
        wochentag.name(),
        wochentag.isArbeitstag()
      );
    }
  }
}

enum Wochentag {
  MONTAG(true, 1),
  DIENSTAG(true, 2),
  MITTWOCH(true, 3),
  DONNERSTAG(true, 4),
  FREITAG(true, 5),
  ZUSATZTAG1(true, 6),
  ZUSATZTAG2(true, 7),
  ZUSATZTAG3(true, 8),
  SAMSTAG(false, 9),
  SONNTAG(false, 10);

  private final boolean arbeitstag;
  private final int tag;

  private static final List<Wochentag> TAGE = Arrays.asList(values());

  Wochentag(boolean a, int tag) {
    this.arbeitstag = a;
    this.tag = tag;
  }

  public boolean isArbeitstag() {
    return this.arbeitstag;
  }

  public int getDayNumber() {
    return this.tag;
  }

  public static List<Wochentag> getListOfDays() {
    return TAGE;
  }
}
