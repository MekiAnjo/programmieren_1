package geometric_shapes;

public class Rectangle extends GeometricShape implements ShapeWithArea {

  private double length;
  private double width;

  Rectangle(double x, double y, double length, double width) {
    super(x, y);
    this.length = length;
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public double getWidth() {
    return width;
  }

  @Override
  public double computeArea() {
    return length * width;
  }
}
