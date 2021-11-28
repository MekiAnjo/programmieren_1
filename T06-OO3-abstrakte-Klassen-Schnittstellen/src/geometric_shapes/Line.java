package geometric_shapes;

public class Line extends GeometricShape {

  private double xEndP;
  private double yEndP;

  Line(double x, double y, double xEndP, double yEndP) {
    super(x, y);
    this.xEndP = xEndP;
    this.yEndP = yEndP;
  }

  public double getxEndP() {
    return xEndP;
  }

  public double getyEndP() {
    return yEndP;
  }
}
