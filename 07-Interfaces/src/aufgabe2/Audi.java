package aufgabe2;

public class Audi implements Car {

  private String model;
  private int horsepower;
  private int xPosition;
  private int yPosition;

  public Audi(String model, int horsepower, int xPosition, int yPosition) {
    this.model = model;
    this.horsepower = horsepower;
    this.xPosition = xPosition;
    this.yPosition = yPosition;
  }

  @Override
  public void drive(int x, int y) {
    xPosition += x;
    yPosition += y;
    System.out.println("das Auto hat sich erfolgreich bewegt!");
  }

  @Override
  public void printPosition() {
    System.out.println("Aktuelle x-Position: " + xPosition);
    System.out.println("Aktuelle y-Position: " + yPosition + "\n");
  }
}
