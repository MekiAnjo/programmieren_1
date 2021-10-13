package de.hft_stuttgart.huto1bif.zeichenketten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextAnalyse {

  public static void main(String[] args) throws IOException {
    System.out.print("Geben Sie einen Satz ein: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String satz;

    satz = br.readLine();
    satz = satz.toLowerCase();

    int[] anzahl = new int['z' - 'a' + 1];

    for (int i = 0; i < satz.length(); i++) {
      Character zeichen = satz.charAt(i);
      if (zeichen >= 'a' && zeichen <= 'z') {
        anzahl[zeichen - 'a']++;
      }
    }

    int summeBuchstaben = 0;
    for (int i = 0; i < anzahl.length; i++) {
      if (anzahl[i] == 0) {
        continue;
      }
      char c = (char) ('a' + i);
      System.out.println(c + ": \t" + anzahl[i]);
      summeBuchstaben += anzahl[i];
    }
    System.out.println("Summe:\t" + summeBuchstaben);
  }
}
