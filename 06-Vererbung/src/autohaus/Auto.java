package autohaus;

public abstract class Auto {

  private String bezeichung;
  private int ps;
  private int baujahr;

  protected Auto(String bezeichung, int ps, int baujahr) {
    this.bezeichung = bezeichung;
    this.ps = ps;
    this.baujahr = baujahr;
  }
}
