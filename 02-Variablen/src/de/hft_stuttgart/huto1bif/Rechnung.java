package de.hft_stuttgart.huto1bif;

public class Rechnung {

  public static void main(String[] args) {
    System.out.println(2 * 3);

    System.out.println(2 * 0.3);

    System.out.println(5000 * (1.02) * (1.02));

    // Modulo
    // ganzzahlige Division von 5 mit 2
    System.out.println(5 % 2);

    /*
     * Da 5 und 3 jeweils int (Ganzzahl) Werte sind, wird auch das Ergebnis als
     * Ganzzahl ausgegeben und dies führt somit zu einem unerwarteten Ergebnis.
     */
    System.out.println("5/3 = " + 5 / 3);

    /*
     * Das erwartete Ergebnis ergibt sich, wenn man den Wert 5.0 verwendet.
     */
    System.out.println("5.0/3 = " + 5.0 / 3);

    /*
     * Die Multiplikation der beiden sehr gro�en Zahlen ergibt einen sog. Overflow:
     * Das Ergebnis ist zu groß für den Datentyp, das zugehörige Bit-Muster wird als
     * negative Zahl interpretiert.
     */
    System.out.println("1000000 * 1000000 = " + 1000000 * 1000000);
    System.out.println("2147483646 + 1 = " + (2147483646 + 1));
    System.out.println("2147483647 + 1 = " + (2147483647 + 1));

    /*
     * Fließpunktzahlen in Java sind nur annähernd genau
     */
    System.out.println("0.1 * 0.1 = " + 0.1 * 0.1);
  }
}
