package de.hft_stuttgart.huto1bif.aufgabe_7_2;

/**
 *
 * @author ivanova
 */
public class Bibliothek {

  private Buch[] bibliothek;
  private Nutzer[] leser;

  public Buch[] getBibliothek() {
    return bibliothek;
  }

  public Nutzer[] getLeser() {
    return leser;
  }

  public Bibliothek(Buch[] liste, Nutzer[] nutzer) {
    bibliothek = liste;
    leser = nutzer;
  }

  public Bibliothek(Buch[] liste) {
    this(liste, new Nutzer[20]);
  }

  public void erstelleNutzer(String name, int nummer, Adresse adresse) {
    for (int i = 0; i < leser.length; i++) {
      if (leser[i] == null) {
        leser[i] = new Nutzer(name, nummer, adresse);
        break;
      }
    }
  }

  public void erstelleMitarbeiter(
    String name,
    int nummer,
    Adresse adresse,
    String raum,
    int durchwahl
  ) {
    for (int i = 0; i < leser.length; i++) {
      if (leser[i] == null) {
        leser[i] = new Mitarbeiter(name, nummer, adresse, raum, durchwahl);
        break;
      }
    }
  }

  public boolean leiheBuch(Buch buch, Nutzer nutzer) {
    if (nutzer.kannAusleihen()) {
      buch.setAusgeliehen(true);
      nutzer.buchAusleihen(buch);
      return true;
    } else {
      return false;
    }
  }

  public void rueckgabeBuch(Buch buch, Nutzer nutzer) {
    buch.setAusgeliehen(false);
    nutzer.buchRueckgeben(buch);
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Buch[] buecher = {
      new Buch("Java ist auch eine Insel", "Christian Ullenboom", 456357),
      new Buch("Robinson Crusoe", "Daniel Defoe", 45635),
      new Buch(
        "Jim Knopf und Lukas der Lokomotivfuehrer",
        "Michael Ende",
        456353
      ),
      new Buch("Herr der Ringe", "Ronald Reuel Tolkien", 464646),
      new Buch("The King of Torts", "John Grisham", 451646),
    };

    Bibliothek bib = new Bibliothek(buecher);

    bib.erstelleMitarbeiter(
      "Daniel Duesentrieb",
      123456,
      new Adresse("Schellingstrasse", 24, 70123, "Stuttgart"),
      "Ententeich",
      1234
    );

    System.out.println(bib.leser[0]);
    // Zum Anzeigen von 10 Büchern die getBuecherListe()-Methode in der
    // Klasse Mitarbeiter entfernen. So lange diese Methode existiert, wird
    // sie immer für ein Mitarbeiter-Objekt aufgerufen und liefert die größere
    // Bücherliste zurück.
    // Existiert sie nicht, wird die von der Klasse Nutzer ererbte Methode verwendet,
    // die die kürzere Bücherliste aus der Klasse Nutzer zurückliefert.
    System.out.println(
      "Darf " + bib.leser[0].getBuecherListe().length + " Buecher ausleihen"
    );

    System.out.println(Nutzer.test(bib.leser[0]));
    System.out.println(Mitarbeiter.test((Mitarbeiter) bib.leser[0]));
  }
}
