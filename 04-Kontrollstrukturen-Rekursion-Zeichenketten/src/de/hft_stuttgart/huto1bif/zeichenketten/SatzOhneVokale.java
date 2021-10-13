package de.hft_stuttgart.huto1bif.zeichenketten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SatzOhneVokale {

  public static void main(String[] args) throws IOException {
    System.out.print("Geben Sie einen Satz ein: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String satz;

    satz = br.readLine();

    for (int i = 0; i < satz.length(); i++) {
      Character zeichen = satz.charAt(i);
      switch (Character.toLowerCase(zeichen)) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
          break;
        default:
          System.out.print(zeichen);
          break;
      }
    }
    System.out.println();
  }
}
