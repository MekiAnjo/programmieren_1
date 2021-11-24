package de.hft_stuttgart.huto1bif.wiederholung_arrays.kleiderschrank;

import java.util.ArrayList;
import java.util.List;

public class Kleiderschrank {

  List<Kleidung> wardrobe = new ArrayList<>();

  public void addKleidung(Kleidung kleidung) {
    if (!isUnique(kleidung)) {
      System.out.println(
        "Dieses Kleidungsstück existiert bereits im Kleiderschrank"
      );
      return;
    }
    wardrobe.add(kleidung);
  }

  public void printInventory() {
    for (Kleidung kleidung : wardrobe) {
      System.out.println(kleidung);
    }
  }

  public boolean isUnique(Kleidung kleidung) {
    for (Kleidung listCloth : this.wardrobe) {
      if (listCloth.equals(kleidung)) {
        return false;
      }
    }
    return true;
  }
}
