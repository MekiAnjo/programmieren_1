package de.hft_stuttgart.huto1bif.wiederholung_arrays.kleiderschrank;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import de.hft_stuttgart.huto1bif.wiederholung_arrays.kleiderschrank.Kleidung.Color;

public class MainProgram {

  private static final Scanner SCAN = new Scanner(System.in);
  private static Kleiderschrank flurKommode = new Kleiderschrank();

  public static void main(String[] args) {
    flurKommode.addKleidung(new Pulli(Color.BLUE, 42));
    flurKommode.addKleidung(new Hose(Color.BLUE, 42));
    flurKommode.addKleidung(new Pulli(Color.BLUE, 42));

    boolean isProgramRunning = true;

    while (isProgramRunning) {
      printMenu();
      int eingabe = SCAN.nextInt();
      switch (eingabe) {
        case 1 -> flurKommode.printInventory();
        case 2 -> hinzufuegenKleidung();
        case 3 -> {
          System.out.println("Bye");
          isProgramRunning = false;
        }
        default -> printDefaultErrorInputMessage();
      }
    }
  }

  private static void printMenu() {
    System.out.println("Was möchtest du am Kleiderschrank machen?");
    System.out.println(
      "1: Schrankinventar ausgeben | 2: Kleidung hinzufügen | 3: Program beeneden"
    );
    System.out.println("Gebe bitte ein Zahl ein");
  }

  private static void hinzufuegenKleidung() {
    System.out.println("Pulli(1) oder Hose(2)?");
    int eingabe = SCAN.nextInt();
    System.out.println("Welche Farbe?");
    System.out.println();
    printColors();
    Color farbe =
      switch (eingabe) {
        case 1 -> Color.BLUE;
        case 2 -> Color.RED;
        default -> null;
      };
    System.out.println("Welche Größe?");
    int groesse = SCAN.nextInt();
    switch (eingabe) {
      case 1 -> flurKommode.addKleidung(new Pulli(farbe, groesse));
      case 2 -> flurKommode.addKleidung(new Hose(farbe, groesse));
    }
  }

  public static void printDefaultErrorInputMessage() {
    System.out.println("Falsche Eingabe!");
  }

  public static void printColors() {
    // Map<Color, String> colors = new EnumMap<>(Color.class);
    String output = Stream
      .of(Color.values())
      .map(Color::name)
      .collect(Collectors.joining(", "));
    System.out.println(output);
  }
}
