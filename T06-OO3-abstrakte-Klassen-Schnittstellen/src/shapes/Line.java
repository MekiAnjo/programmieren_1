package shapes;

public class Line extends GeometricShape {

  private int xEndP;
  private int yEndP;

  public Line(int x, int y, int xEndP, int yEndP) {
    super(x, y);
    this.xEndP = xEndP;
    this.yEndP = yEndP;
  }
}
