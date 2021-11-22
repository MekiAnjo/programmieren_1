package shapes;

/**
 * Circle
 */
public class Circle extends GeometricShape implements ShapeWithArea {

  private double radius;

  protected Circle(double x, double y, double radius) {
    super(x, y);
    this.radius = radius;
  }

  @Override
  public double computeArea() {
    return Math.pow(radius, 2) * Math.PI;
  }
}
