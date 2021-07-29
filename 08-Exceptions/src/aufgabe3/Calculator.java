package aufgabe3;

import java.util.Scanner;

public class Calculator {

  private static final Scanner SCAN = new Scanner(System.in);

  public static void main(String[] args) {
    boolean isProgrammRunning = true;
    while (isProgrammRunning) {
      int x = 0;
      int y = 0;

      System.out.println("Welche Grundrechenart soll benutzt werden?");
      System.out.println(
        "1: add" +
        " | 2: subtract" +
        " | 3: multiply" +
        " | 4: divide" +
        " | 5: end program"
      );
      System.out.print("Eingabe: ");
      int selection = SCAN.nextInt();

      System.out.println("Gebe die Zahlen ein die verrechnet werden sollen");
      System.out.print("x = ");
      x = SCAN.nextInt();
      System.out.print("y = ");
      y = SCAN.nextInt();

      switch (selection) {
        case 1 -> add(x, y);
        case 2 -> subtract(x, y);
        case 3 -> multiply(x, y);
        case 4 -> divide(x, y);
        case 5 -> isProgrammRunning = false;
        default -> System.out.println(
          "Ungültige Eingabe, bitte erneut eingeben"
        );
      }
      System.out.println();
    }
  }

  private static void add(int x, int y) {
    System.out.println("Additionsergebnis lautet: " + (x + y));
  }

  private static void subtract(int x, int y) {
    System.out.println("Subtrahierungssergebnis lautet: " + (x - y));
  }

  private static void multiply(int x, int y) {
    System.out.println("Multiplikationsergebnis lautet: " + (x * y));
  }

  private static void divide(int x, int y) {
    try {
      System.out.println("Divisionssergebnis lautet: " + (x / y));
    } catch (ArithmeticException e) {
      e.printStackTrace();
    }
  }
}
