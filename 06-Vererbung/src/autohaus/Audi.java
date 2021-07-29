package autohaus;

public class Audi extends Auto {

  private String austattung;

  protected Audi(
    String bezeichung,
    int ps,
    int baujahr,
    String ausstattung,
    int anzahl
  ) {
    super(bezeichung, ps, baujahr);
    this.austattung = ausstattung;
    System.out.println(
      "Das Auto mit Bezeichnung: " +
      bezeichung +
      " ist das " +
      (anzahl + 1) +
      " te im gesamten Autohaus"
    );
  }
}
