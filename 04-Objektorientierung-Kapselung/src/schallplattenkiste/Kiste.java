package schallplattenkiste;

import java.util.Scanner;

public class Kiste {

  static Schallplatte[] spArr = new Schallplatte[10];
  static int anzahlSchallplatten = 0;

  public static void main(String[] args) {
    System.out.println("Was möchtest du tun?");
    System.out.println(
      "1 Schallplatte hinzufügen" +
      "| 2 Schallplatten auflisten" +
      "| 3 Schallplatte löschen" +
      "| 4 Programm beenden"
    );

    Scanner sc = new Scanner(System.in);

    boolean isProgrammRunning = true;

    while (isProgrammRunning) {
      System.out.print("Auswahl: ");
      int eingabe = sc.nextInt();
      sc.nextLine();

      switch (eingabe) {
        case 1 -> {
          System.out.println(
            "Gebe den Titel und Interpreten der Schallplatte an"
          );
          System.out.print("Titel: ");
          String title = sc.nextLine();
          System.out.print("Interpreter: ");
          String interpreter = sc.nextLine();
          schallplattHinzufuegen(title, interpreter);
        }
        case 2 -> kistenInhaltAuflisten();
        case 3 -> {
          System.out.println(
            "Gebe den Index der zu löschenden Schallplatte an"
          );
          System.out.print("Index: ");
          int index = sc.nextInt();
          schallplatteLoeschen(index);
        }
        case 4 -> isProgrammRunning = false;
        default -> System.out.println(
          "Ungültige Eingabe, bitte erneut eingeben"
        );
      }
    }
    sc.close();
  }

  static void schallplattHinzufuegen(String titel, String interpreter) {
    if (anzahlSchallplatten >= spArr.length) {
      System.out.println(
        "Die Kiste ist voll, es müssen erst wieder Platten entfernt werden"
      );
      return;
    }
    Schallplatte schallplatte = new Schallplatte(titel, interpreter);
    for (int i = 0; i < spArr.length; i++) {
      if (spArr[i] == null) {
        spArr[i] = schallplatte;
        System.out.println(schallplatte + " wurde hinzugefügt");
        break;
      }
    }
    anzahlSchallplatten++;
  }

  static void kistenInhaltAuflisten() {
    if (anzahlSchallplatten == 0) {
      System.out.println("Die Kiste ist leer, füge Platten hinzu");
      return;
    }
    System.out.println("Schallplattenkisten Inhalt:");
    for (int i = 0; i < spArr.length; i++) {
      if (spArr[i] == null) {
        System.out.println((i + 1) + ": -");
        continue;
      }
      System.out.println((i + 1) + ": " + spArr[i]);
    }
  }

  static void schallplatteLoeschen(int index) {
    if (anzahlSchallplatten == 0) {
      System.out.println("Die Kiste ist leer, füge Platten hinzu");
      return;
    }
    int loeschIndex = index - 1;
    System.out.println(spArr[loeschIndex] + " wurde gelöscht");
    spArr[loeschIndex] = null;
    anzahlSchallplatten--;
  }
}
