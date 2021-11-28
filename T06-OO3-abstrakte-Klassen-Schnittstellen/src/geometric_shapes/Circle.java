package geometric_shapes;

public class Circle extends GeometricShape implements ShapeWithArea {

  private double radius;

  Circle(double x, double y, double radius) {
    super(x, y);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  @Override
  public double computeArea() {
    return Math.PI * Math.pow(radius, 2);
  }
}
