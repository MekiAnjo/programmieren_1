package shapes;

public class MainProgram {

  public static void main(String[] args) {
    GeometricShape[] myGeoFigs = new GeometricShape[4];
    myGeoFigs[0] = new Circle(10, 10, 40);
    myGeoFigs[1] = new Square(600, 60, 10);
    myGeoFigs[2] = new Rectangle(10, 20, 100, 20);
    myGeoFigs[3] = new Line(15, 20, 80, 90);

    // Ab java 14
    for (GeometricShape GeometricShape : myGeoFigs) {
      if (GeometricShape instanceof ShapeWithArea fig) {
        System.out.println(fig.computeArea());
      }
    }
    System.out.println();
    // Vor java 14
    for (GeometricShape GeometricShape : myGeoFigs) {
      if (GeometricShape instanceof ShapeWithArea) {
        System.out.println(((ShapeWithArea) GeometricShape).computeArea());
      }
    }
  }
}
