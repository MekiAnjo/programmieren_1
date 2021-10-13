package de.hft_stuttgart.huto1bif.kontrollstrukturen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FaelleSwitchCase {

  public static void main(String[] args) throws IOException {
    System.out.print("Geben Sie eine Note ein: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String notenText;

    notenText = br.readLine();

    switch (notenText.toLowerCase()) {
      case "sehr gut":
        System.out.println(1);
        break;
      case "gut":
        System.out.println(2);
        break;
      case "befriedigend":
        System.out.println(3);
        break;
      case "ausreichend":
        System.out.println(4);
        break;
      case "mangelhaft":
        System.out.println(5);
        break;
      case "ungen�gend":
        System.out.println(6);
        break;
      default:
        System.err.println("unbekannt");
        break;
    }
  }
}
