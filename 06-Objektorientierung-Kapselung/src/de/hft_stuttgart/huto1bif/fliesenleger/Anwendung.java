package de.hft_stuttgart.huto1bif.fliesenleger;

import java.util.Scanner;

public class Anwendung {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println(
      "Bitte geben Sie die gewuenschte Kantenlaenge der Fliese ein: "
    );
    int kantenlaenge = scanner.nextInt();
    Fliese fliese = new Fliese(kantenlaenge); //Verwendete Fliese mit Kantenl�nge

    System.out.println("Bitte geben Sie die Anzahl der Abschnitte ein: ");
    int anzahlAbschnitte = scanner.nextInt();
    FlaecheRechteck[] abschnitt = new FlaecheRechteck[anzahlAbschnitte];

    for (int i = 0; i < abschnitt.length; i++) {
      System.out.println(
        "Bitte geben Sie die Laenge des " + (i + 1) + ". Abschnitts ein: "
      );
      int laenge = scanner.nextInt();
      System.out.println(
        "Bitte geben Sie die Breite des " + (i + 1) + ". Abschnitts ein: "
      );
      int breite = scanner.nextInt();
      abschnitt[i] = new FlaecheRechteck(laenge, breite);
    }

    BodenFlaeche bodenFlaeche = new BodenFlaeche(abschnitt);

    System.out.println(bodenFlaeche.druckeBelegung(fliese));
    System.out.println(
      "Insgesamt werden " +
      bodenFlaeche.anzahlFliesen(fliese) +
      " Fliesen ben�tigt"
    );

    scanner.close();
  }
}
