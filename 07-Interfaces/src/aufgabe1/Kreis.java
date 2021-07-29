package aufgabe1;

public class Kreis extends GeometrischeFigur implements FigurMitFlaeche {

  private int radius;

  public Kreis(int x, int y, int radius) {
    super(x, y);
    this.radius = radius;
  }

  @Override
  public double flaecheBerechnen() {
    return Math.pow(radius, 2) * Math.PI;
  }
}
