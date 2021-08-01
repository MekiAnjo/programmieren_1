package de.hft_stuttgart.huto1bif;

public class Geheimschrift {

  public static void main(String[] args) {
    // Buchstabe der umgewandelt werden soll
    char buchstabe = 'V';
    // Anzahl der Positionen, um die der Buchstabe verschoben werden soll
    int rotation = 6;
    // Merken, an welcher Stelle das Alphabet in der char-Tabelle anfängt
    // char kann in int umgewandelt werden
    int alphabetStart = 'A';
    // Startposition ermitteln
    buchstabe -= alphabetStart;
    // Rotieren
    buchstabe += rotation;
    // Wenn über das Alphabet hinausgerutscht wird, wird vorne wieder angefangen
    buchstabe %= 26;
    // Am Anfang Startposition abgezogen, muss jetzt wieder dazugerechnet werden
    buchstabe += alphabetStart;
    // Ergebnis ausgeben
    System.out.println(buchstabe);
  }
}
