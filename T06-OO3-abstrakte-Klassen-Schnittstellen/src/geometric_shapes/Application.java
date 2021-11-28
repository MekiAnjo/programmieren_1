package geometric_shapes;

public class Application {

  public static void main(String[] args) {
    GeometricShape[] shapes = {
      new Circle(0, 0, 5),
      new Square(0, 0, 5),
      new Rectangle(0, 0, 4, 5),
      new Line(0, 0, 5, 5),
    };

    for (GeometricShape geometricShape : shapes) {
      if (geometricShape instanceof ShapeWithArea) {
        System.out.printf(
          "%s. Meine Fl�che ist: %.2f\n",
          geometricShape,
          ((ShapeWithArea) geometricShape).computeArea()
        );
      }
    }
  }
}
