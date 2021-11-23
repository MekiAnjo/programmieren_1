package de.hft_stuttgart.huto1bif.wiederholung_arrays.kleiderschrank;

import static de.hft_stuttgart.huto1bif.wiederholung_arrays.kleiderschrank.Kleidung.Color.*;

public class Kleiderschrank {

  public static void main(String[] args) {
    Kleidung[] kleider = new Kleidung[] {
      new Pulli(BLUE, 42),
      new Pulli(BLUE, 42),
    };

    for (Kleidung kleidung : kleider) {
      System.out.println(kleidung);
    }

    System.out.println(kleider[0].equals(kleider[1]));
  }
}
