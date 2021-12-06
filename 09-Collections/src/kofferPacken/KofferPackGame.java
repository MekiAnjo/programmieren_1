package kofferPacken;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KofferPackGame {

  private static List<String> koffer = new ArrayList<>();
  private static final Scanner SCAN = new Scanner(System.in);

  public static void main(String[] args) {
    boolean isProgramRunning = true;
    int anzahlArtikel = 0;

    while (isProgramRunning) {
      addToKoffer();
      for (String artikel : koffer) {
        System.out.println("Gebe den vorherigen Artikel an");
        String eingabe = SCAN.nextLine();
        if (!eingabe.equalsIgnoreCase(artikel)) {
          isProgramRunning = false;
          System.out.println("Falsch, schade!");
          break;
        }
        System.out.println("Richtig!");
        anzahlArtikel++;
      }
      System.out.println("-".repeat(50));
    }
    System.out.println("Du hast " + anzahlArtikel + " Artikel aufgezählt");
  }

  private static void addToKoffer() {
    System.out.println("Gebe einen neuen Artikel an");
    String artikel = SCAN.nextLine();
    koffer.add(artikel);
  }
}
