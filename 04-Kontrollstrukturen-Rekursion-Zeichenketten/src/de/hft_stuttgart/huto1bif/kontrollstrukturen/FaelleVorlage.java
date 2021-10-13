package de.hft_stuttgart.huto1bif.kontrollstrukturen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FaelleVorlage {

  public static void main(String[] args) throws IOException {
    System.out.print("Geben Sie eine Note ein: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String notenText;

    notenText = br.readLine();
    // to do
  }
}
