package kofferPacken;

import java.util.LinkedList;
import java.util.Scanner;

public class KofferPacken1Plus {

  public static void main(String[] args) {
    LinkedList<String> koffer = new LinkedList<>();
    int i = 0;
    hinzufuegen(koffer);
    while (aufzaehlen(koffer)) {
      hinzufuegen(koffer);
      i++;
    }
    System.out.println("Du hast " + i + "Elemente aufgezählt");
  }

  private static boolean aufzaehlen(LinkedList<String> koffer) {
    Scanner scan = new Scanner(System.in);
    for (String inhalt : koffer) {
      System.out.println("Gebe den vorherigen Artikel an");
      String artikel = scan.next().toLowerCase();
      if (!artikel.equals(inhalt)) {
        return false;
      }
    }
    return true;
  }

  private static void hinzufuegen(LinkedList<String> koffer) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Gib einen neuen Artikel an");
    String artikel = scan.next().toLowerCase();
    koffer.add(artikel);
  }
}
