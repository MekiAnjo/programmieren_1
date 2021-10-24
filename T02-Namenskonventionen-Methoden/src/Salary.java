public class Salary {

  private static final int PERCENTAGE = 3; // Konstante, da final. Konstanten immer in Großbuchstaben.

  public static void main(String[] args) {
    // Entweder Methode aufrufen und in Variable speichern und diese daraufhin
    // ausgeben...
    float salary1 = computeSalary(1500);
    System.out.println(salary1);

    // Oder alles in einer Zeile machen...
    System.out.println(computeSalary(2000));
    System.out.println(computeSalary(15000));
  }

  private static float computeSalary(float basicSalary) { // Ergebnis berechnen und zurückgeben
    return basicSalary + (basicSalary * PERCENTAGE / 100);
    // Alternativ als Mehrzeiler:
    //		float gehalt = grundgehalt + (grundgehalt * PERCENTAGE / 100);
    //		return gehalt;
  }
}
