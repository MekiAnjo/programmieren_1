public class Wetterlage {

  static final int ANZAHL_TAGE = 14;

  public static void main(String[] args) {
    double[] regen = new double[ANZAHL_TAGE];

    for (int i = 0; i < regen.length; i++) {
      regen[i] = Math.random();
    }

    for (int i = 0; i < regen.length; i++) {
      String wetterlage;
      if (regen[i] > .7) {
        wetterlage = "Regen";
      } else if (regen[i] > .3) {
        wetterlage = "Wolken";
      } else {
        wetterlage = "Sonne";
      }
      System.out.printf("Tag %d: %.1f%%, %s%n", i + 1, regen[i] * 100, wetterlage);
    }
  }
}
