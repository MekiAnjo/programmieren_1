package verwaltung;

public class Verwaltung {

  public static void main(String[] args) {
    Mitarbeiter mitarbeiter1 = new Angestellter(
      "Fritz",
      "Peter",
      5000,
      2004,
      30
    );
    Mitarbeiter mitarbeiter2 = new Aushilfe("Lukas", "Bauer", 450, 20);
    System.out.println(mitarbeiter1);
    System.out.println(mitarbeiter2);
  }
}
