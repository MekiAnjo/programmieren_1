package de.hft_stuttgart.huto1bif;

public class Geldpruefung {

  public static void main(String[] args) {
    int p = pruefziffer('Z', 6, 0, 1, 6, 2, 2, 0, 0, 2, 2);
    System.out.println(p);
  }

  public static int pruefziffer(
    char nbz,
    int z1,
    int z2,
    int z3,
    int z4,
    int z5,
    int z6,
    int z7,
    int z8,
    int z9,
    int z10
  ) {
    int quersum =
      buchstabenQuersumme(nbz) +
      z1 +
      z2 +
      z3 +
      z4 +
      z5 +
      z6 +
      z7 +
      z8 +
      z9 +
      z10;
    quersum %= 9;
    quersum -= 8;
    if (quersum > 0) return quersum;
    return 9;
  }

  public static int pruefziffer(
    char nbz,
    char c1,
    int z2,
    int z3,
    int z4,
    int z5,
    int z6,
    int z7,
    int z8,
    int z9,
    int z10
  ) {
    int quersum =
      buchstabenQuersumme(nbz) +
      buchstabenQuersumme(c1) +
      z2 +
      z3 +
      z4 +
      z5 +
      z6 +
      z7 +
      z8 +
      z9 +
      z10;
    quersum %= 9;
    quersum -= 7;
    // if (quersum > 0) return quersum;
    if (quersum == 0) return 9;
    if (quersum == -1) return 8;
    return quersum;
  }

  private static int buchstabenQuersumme(char c) {
    int zahl = c;
    int sum = 0;
    while (zahl != 0) {
      sum += zahl % 10;
      zahl /= 10;
    }
    return sum;
  }
}
