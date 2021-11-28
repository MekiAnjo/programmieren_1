package geometric_shapes;

public class Square extends GeometricShape implements ShapeWithArea {

  private double width;

  Square(double x, double y, double width) {
    super(x, y);
    this.width = width;
  }

  public double getWidth() {
    return width;
  }

  @Override
  public double computeArea() {
    return width * width;
  }
}
