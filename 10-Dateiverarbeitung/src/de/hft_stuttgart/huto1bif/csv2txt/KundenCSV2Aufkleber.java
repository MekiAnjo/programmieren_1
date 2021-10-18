package de.hft_stuttgart.huto1bif.csv2txt;

import java.io.File;

public interface KundenCSV2Aufkleber {
  public static final int ANZAHL_SPALTEN = 7;

  void konvertiereKundendaten(File quelle, File ziel);
}
