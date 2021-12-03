package wurzeln;

/**
 * Wurzeln
 */
public class Wurzeln {

  public static void main(String[] args) {
    int a = -4;
    double ergebnis = -1;

    try {
      ergebnis = zieheWurzel(a);
    } catch (Exception e) {
      System.err.println("Error");
    }

    System.out.println("Die Wurzel von a=" + a + " ist: " + ergebnis);
  }

  public static double zieheWurzel(double x) {
    if (x < 0) {
      throw new MatheRuntimeException();
    }
    return Math.sqrt(x);
  }
}
