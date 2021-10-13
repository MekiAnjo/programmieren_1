package de.hft_stuttgart.huto1bif.kontrollstrukturen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FaelleIfElse {

  public static void main(String[] args) throws IOException {
    System.out.print("Geben Sie eine Note ein: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String notenText;

    notenText = br.readLine();

    if (notenText.toLowerCase().equals("sehr gut")) {
      System.out.println(1);
    } else if (notenText.toLowerCase().equals("gut")) {
      System.out.println(2);
    } else if (notenText.toLowerCase().equals("befriedigend")) {
      System.out.println(3);
    } else if (notenText.toLowerCase().equals("ausreichend")) {
      System.out.println(4);
    } else if (notenText.toLowerCase().equals("mangelhaft")) {
      System.out.println(5);
    } else if (notenText.toLowerCase().equals("ungen�gend")) {
      System.out.println(6);
    } else {
      System.err.println("unbekannt");
    }
  }
}
