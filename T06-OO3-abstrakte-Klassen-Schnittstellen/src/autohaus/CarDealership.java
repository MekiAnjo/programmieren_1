package autohaus;

import java.util.Random;

public class CarDealership {

  private static final String[] AUDI_ROSTER = {
    "A1",
    "A2",
    "A3",
    "A4",
    "A5",
    "A6",
    "A7",
    "RS3",
    "RS4",
    "RS5",
  };

  private static final String[] BMW_ROSTER = {
    "M1",
    "M2",
    "M3",
    "M4",
    "M5",
    "M6",
  };

  private Car[] carRoster;

  private static final Random RAND = new Random();

  public CarDealership() {
    this.carRoster = new Car[10];
  }

  public static void main(String[] args) {
    CarDealership fidler = new CarDealership();
    CarDealership gasche = new CarDealership();

    for (int i = 0; i < 10; i++) {
      fidler.carRoster[i] =
        new BMW(BMW_ROSTER[randomIndex(BMW_ROSTER.length)], 450, true, 2020);
    }
    for (int i = 0; i < 10; i++) {
      gasche.carRoster[i] =
        new Audi(
          AUDI_ROSTER[randomIndex(AUDI_ROSTER.length)],
          120,
          "Leder",
          2019
        );
    }
    fidler.carRoster[0].printBrandSlogan();
    for (Car car : fidler.carRoster) {
      System.out.println(car);
    }
    System.out.println();
    gasche.carRoster[0].printBrandSlogan();
    for (Car car : gasche.carRoster) {
      System.out.println(car);
    }
  }

  private static int randomIndex(int length) {
    return RAND.nextInt(length);
  }
}
