package composition;

public class Application {

  public static void main(String[] args) {
    Car car = new Car("MyCar");
    System.out.println("Horsepower: " + car.getHorsepower());
  }
}
