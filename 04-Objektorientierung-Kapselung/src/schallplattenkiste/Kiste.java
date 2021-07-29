package schallplattenkiste;

import java.util.Scanner;

public class Kiste {

  public static void main(String[] args) {
    System.out.println("Was möchtest du tun?");
    System.out.println(
      "1 Schallplatte hinzufügen" +
      "| 2 Schallplatten auflisten" +
      "| 3 Schallplatte löschen" +
      "| 4 Programm beenden"
    );

    Scanner sc = new Scanner(System.in);
  }

  static void schallplattHinzufuegen(String titel) {}

  static void kistenInhaltAuflisten() {}

  static void schallplatteLoeschen(int index) {}
}
