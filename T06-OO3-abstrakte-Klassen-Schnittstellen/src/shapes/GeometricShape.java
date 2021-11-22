package shapes;

/**
 * GeometricShape
 */
public abstract class GeometricShape {

  private double x;
  private double y;

  protected GeometricShape(double x, double y) {
    this.x = x;
    this.y = y;
  }
}
