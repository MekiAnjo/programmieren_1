package de.hft_stuttgart.huto1bif.aufgabe_7_2;

/**
 *
 * @author ivanova
 */
public class Nutzer {

  private String name;
  private int id;
  private Adresse adresse;
  private Buch[] buecherListe;

  public Nutzer(String name, int nummer, Adresse adresse) {
    this.name = name;
    this.id = nummer;
    this.adresse = adresse;
    this.buecherListe = new Buch[10];
  }

  public Adresse getAdresse() {
    return adresse;
  }

  public Buch[] getBuecherListe() {
    return buecherListe;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public void buchAusleihen(Buch buch) {
    for (int i = 0; i < buecherListe.length; i++) {
      if (buecherListe[i] == null) {
        buecherListe[i] = buch;
        break;
      }
    }
  }

  public void buchRueckgeben(Buch buch) {
    Buch[] neu = new Buch[buecherListe.length];

    for (int i = 0, j = 0; i < buecherListe.length; i++) {
      if (buecherListe[i] == null) {
        break;
      } else if (buecherListe[i].equals(buch)) {
        continue;
      } else {
        neu[j] = buecherListe[i];
        j++;
      }
    }
    buecherListe = neu;
  }

  public boolean kannAusleihen() {
    return buecherListe[buecherListe.length - 1] == null;
  }

  public void druckBuecherListe() {
    for (int i = 0; i < buecherListe.length; i++) {
      if (buecherListe[i] != null) {
        System.out.println(buecherListe[i]);
      }
    }
  }

  public String toString() {
    return name + " (" + id + ")";
  }

  public static String test(Nutzer nutzer) {
    return "Methode test() in Nutzer ausgefuehrt";
  }
}
