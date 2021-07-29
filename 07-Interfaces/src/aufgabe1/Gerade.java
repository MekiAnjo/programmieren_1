package aufgabe1;

public class Gerade extends GeometrischeFigur {

  private int XEndP;
  private int YEndP;

  public Gerade(int x, int y, int XEndP, int YEndP) {
    super(x, y);
    this.XEndP = XEndP;
    this.YEndP = YEndP;
  }
}
