package de.hft_stuttgart.huto1bif;

public class QuadratischeGleichung {

  public static void main(String[] args) {
    double p = 0.0;
    double q = -4.0;
    System.out.println(
      "Die Quadratische Gleichung lautet: x^2 + " + p + "x + " + q
    );
    berechneNullstellex1(p, q);
    berechneNullstellex2(p, q);
  }

  public static void berechneNullstellex1(double p, double q) {
    double x1 = -p / 2 + Math.sqrt(Math.pow((p / 2), 2) - q);
    System.out.println("Nullstelle x1 = " + x1);
  }

  public static void berechneNullstellex2(double p, double q) {
    double x2 = -p / 2 - Math.sqrt(Math.pow((p / 2), 2) - q);
    System.out.println("Nullstelle x2 = " + x2);
  }
}
