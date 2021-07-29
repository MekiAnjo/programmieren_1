package aufgabe1;

public class Rechteck extends GeometrischeFigur implements FigurMitFlaeche {

  private int laenge;
  private int breite;

  public Rechteck(int x, int y, int laenge, int breite) {
    super(x, y);
    this.laenge = laenge;
    this.breite = breite;
  }

  @Override
  public double flaecheBerechnen() {
    return laenge * breite;
  }
}
