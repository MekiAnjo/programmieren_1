package de.hft_stuttgart.huto1bif.aufgabe_7_2;

/**
 *
 * @author ulrike
 */
public class Mitarbeiter extends Nutzer {

  private String raum;
  private int durchwahl;

  private Buch[] buecherListe;

  public Mitarbeiter(
    String name,
    int nummer,
    Adresse adresse,
    String raum,
    int durchwahl
  ) {
    super(name, nummer, adresse);
    this.raum = raum;
    this.durchwahl = durchwahl;
    this.buecherListe = new Buch[20];
  }

  public String getRaum() {
    return raum;
  }

  public int getDurchwahl() {
    return durchwahl;
  }

  public Buch[] getBuecherListe() {
    return buecherListe;
  }

  public String toString() {
    return "Mitarbeiter: " + super.toString();
  }

  public static String test(Mitarbeiter mit) {
    return "Methode test() in Mitarbeiter ausgefuehrt";
  }
}
