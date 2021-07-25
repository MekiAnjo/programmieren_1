import java.util.Scanner;

/**
 * Kalorienverbrauch
 */
public class Kalorienverbrauch {

  private static final Scanner EINGABE = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Gib dein Körpergewicht in KG ein: ");
    double gewicht  = EINGABE.nextDouble();
    System.out.print("Gib die gelaufene oder zu laufende Distanz in km an: ");
    double distanz = EINGABE.nextDouble();
    double energieumsatz = gewicht * distanz;
    System.out.println();
    System.out.println("Berechnung:");
    System.out.printf("%.2f kg x %.2f km = %.2f kcal", gewicht, distanz, energieumsatz);
  }
}
