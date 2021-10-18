package de.hft_stuttgart.huto1bif.aufgabe5_3;

public class Bruch {

  private int zaehler, nenner;

  public Bruch(int zaehler, int nenner) {
    if (nenner == 0) throw new RuntimeException("Division durch 0");
    if (nenner > 0) {
      this.zaehler = zaehler;
      this.nenner = nenner;
    } else {
      this.zaehler = -zaehler;
      this.nenner = -nenner;
    }
  }

  public int getNenner() {
    return nenner;
  }

  public int getZaehler() {
    return zaehler;
  }

  private int ggT(int a, int b) {
    if (b == 0) return Math.abs(a); else return ggT(b, a % b);
  }

  public void kuerzen() {
    int teiler = ggT(zaehler, nenner);
    zaehler = zaehler / teiler;
    nenner = nenner / teiler;
  }

  public Bruch addiere(Bruch summand) {
    int ergZaehler =
      zaehler * summand.getNenner() + summand.getZaehler() * nenner;
    int ergNenner = nenner * summand.getNenner();
    Bruch ergebnis = new Bruch(ergZaehler, ergNenner);
    ergebnis.kuerzen();
    return ergebnis;
  }

  public Bruch subtrahiere(Bruch subtrahend) {
    int ergZaehler =
      zaehler * subtrahend.getNenner() - subtrahend.getZaehler() * nenner;
    int ergNenner = nenner * subtrahend.getNenner();
    Bruch ergebnis = new Bruch(ergZaehler, ergNenner);
    ergebnis.kuerzen();
    return ergebnis;
  }

  public Bruch kehrwert() {
    Bruch ergebnis = new Bruch(nenner, zaehler);
    return ergebnis;
  }

  public Bruch multipliziere(Bruch multiplikant) {
    int ergZaehler = zaehler * multiplikant.getZaehler();
    int ergNenner = nenner * multiplikant.getNenner();
    Bruch ergebnis = new Bruch(ergZaehler, ergNenner);
    ergebnis.kuerzen();
    return ergebnis;
  }

  public Bruch dividiere(Bruch quotient) {
    Bruch ergebnis = multipliziere(quotient.kehrwert());
    ergebnis.kuerzen();
    return ergebnis;
  }

  public Bruch hoch(int exp) {
    if (exp < 0) return this.hoch(-exp).kehrwert();

    if (exp == 0) return new Bruch(1, 1); else return this.multipliziere(
        this.hoch(exp - 1)
      );
  }

  public String toString() {
    if (nenner != 1) return zaehler + "/" + nenner; else return Integer
      .valueOf(zaehler)
      .toString(); //int in String umwandeln
  }
}
