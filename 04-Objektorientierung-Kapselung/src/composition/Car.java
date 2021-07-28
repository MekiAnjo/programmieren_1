package composition;

public class Car {

  private String name;
  private Engine engine;

  public Car(String name) {
    this.name = name;
    this.engine = new Engine("petrol", 300);
  }

  public int getHorsepower() {
    return engine.getHorsepower();
  }

  public String getName() {
    return this.name;
  }
}
