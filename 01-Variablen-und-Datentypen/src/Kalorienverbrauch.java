import java.util.Scanner;

/**
 * Kalorienverbrauch
 */
public class Kalorienverbrauch {

  public static void main(String[] args) {
    Scanner eingabe = new Scanner(System.in);

    System.out.print("Gib dein Körpergewicht in KG ein: ");
    double gewicht = eingabeEinlesen(eingabe);
    System.out.print("Gib die gelaufene oder zu laufende Distanz in km an: ");
    double distanz = eingabeEinlesen(eingabe);
    double energieumsatz = berechneKcal(gewicht, distanz);
    System.out.println();
    printOutput(gewicht, distanz, energieumsatz);
  }

  private static double eingabeEinlesen(Scanner eingabe) {
    return eingabe.nextDouble();
  }

  private static double berechneKcal(double gewicht, double distanz) {
    return gewicht * distanz;
  }

  private static void printOutput(
    double gewicht,
    double distanz,
    double energieumsatz
  ) {
    System.out.println("Berechnung:");

    System.out.printf(
      "%.2f kg x %.2f km = %.2f kcal",
      gewicht,
      distanz,
      energieumsatz
    );
  }
}
