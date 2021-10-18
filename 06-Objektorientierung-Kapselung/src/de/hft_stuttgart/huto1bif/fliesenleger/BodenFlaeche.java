package de.hft_stuttgart.huto1bif.fliesenleger;

public class BodenFlaeche {

  private FlaecheRechteck[] abschnitt;

  public BodenFlaeche(FlaecheRechteck[] abschnitt) {
    super();
    this.abschnitt = abschnitt;
  }

  public int anzahlFliesen(Fliese fliese) {
    int anzahl = 0;
    for (FlaecheRechteck fr : abschnitt) {
      anzahl += fr.anzahlFliesen(fliese);
    }
    return anzahl;
  }

  public String druckeBelegung(Fliese fliese) {
    String result;
    result = "Bodenflaeche\n";
    for (FlaecheRechteck fr : abschnitt) {
      result += "- " + fr.toString() + fr.anzahlFliesen(fliese) + "\tFliesen\n";
    }
    return result;
  }
}
