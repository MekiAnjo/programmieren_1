package shapes;

public class Rectangle extends GeometricShape implements ShapeWithArea {

  private double length;
  private double width;

  protected Rectangle(double x, double y, double length, double width) {
    super(x, y);
    this.length = length;
    this.width = width;
  }

  @Override
  public double computeArea() {
    return length * width;
  }
}
