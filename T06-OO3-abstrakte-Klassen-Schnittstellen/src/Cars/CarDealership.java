package Cars;

import java.util.Arrays;

public class CarDealership {

  Car[] garage;
  private int counter = 0;

  public CarDealership() {
    garage = new Car[10];
  }

  public Car[] getGarage() {
    return garage;
  }

  public void addCar(Car car) {
    if (counter < 10) {
      garage[counter] = car;
      counter++;
    } else {
      System.err.println("Die Garage ist voll.");
    }
  }

  public static void main(String[] args) {
    CarDealership autohausMaier = new CarDealership();

    Audi audo = new Audi("R8", 620, 2019, "Sitzheizung");
    BMW bmw = new BMW("Z4", 340, 2014, false);

    autohausMaier.addCar(audo);
    autohausMaier.addCar(bmw);

    System.out.println(Arrays.toString(autohausMaier.getGarage()));
  }
}
