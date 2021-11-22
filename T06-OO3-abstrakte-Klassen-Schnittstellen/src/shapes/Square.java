package shapes;

public class Square extends GeometricShape implements ShapeWithArea {

  private double width;

  protected Square(double x, double y, double width) {
    super(x, y);
    this.width = width;
  }

  @Override
  public double computeArea() {
    return Math.pow(width, 2);
  }
}
