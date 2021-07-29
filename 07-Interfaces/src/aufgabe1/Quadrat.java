package aufgabe1;

public class Quadrat extends GeometrischeFigur implements FigurMitFlaeche {

  private int laenge;

  public Quadrat(int x, int y, int laenge) {
    super(x, y);
    this.laenge = laenge;
    //TODO Auto-generated constructor stub
  }

  @Override
  public double flaecheBerechnen() {
    return Math.pow(laenge, 2);
  }
}
