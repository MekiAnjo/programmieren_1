package Cars;

public abstract class Car {

  private String model;
  private int horsePower;
  private int yearOfFabrication;

  Car(String model, int horsePower, int yearOfFabrication) {
    this.model = model;
    this.horsePower = horsePower;
    this.yearOfFabrication = yearOfFabrication;
  }

  public String getModel() {
    return model;
  }

  public int getHorsePower() {
    return horsePower;
  }

  public int getYearOfFabrication() {
    return yearOfFabrication;
  }

  public abstract void printBrandSlogan();

  @Override
  public String toString() {
    return (
      "{Marke: " +
      this.getClass().getSimpleName() +
      " | Modell: " +
      this.getModel() +
      " | PS: " +
      this.getHorsePower() +
      " | Baujahr: " +
      this.getYearOfFabrication() +
      "}"
    );
  }
}
