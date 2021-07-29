package autohaus;

/**
 * BMW
 */
public class BMW extends Auto {

  private boolean abo;

  protected BMW(
    String bezeichung,
    int ps,
    int baujahr,
    boolean abo,
    int anzahl
  ) {
    super(bezeichung, ps, baujahr);
    this.abo = abo;
    System.out.println(
      "Das Auto mit Bezeichnung: " +
      bezeichung +
      " ist das " +
      (anzahl + 1) +
      " te im gesamten Autohaus"
    );
  }
}
