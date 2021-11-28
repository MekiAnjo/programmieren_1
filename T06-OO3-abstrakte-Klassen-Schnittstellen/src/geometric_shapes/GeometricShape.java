package geometric_shapes;

public abstract class GeometricShape {

  private double x;
  private double y;

  GeometricShape(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  @Override
  public String toString() {
    return "Ich bin ein " + this.getClass().getSimpleName();
  }
}
