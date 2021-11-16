package verwaltung;

public class Administration {

  public static void main(String[] args) {
    Employee employee1 = new Personnel("Fritz", "Peter", 5000, 2004, 30);
    Employee employee2 = new Temp("Lukas", "Bauer", 450, 20);
    System.out.println(employee1);
    System.out.println(employee2);
  }
}
