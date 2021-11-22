package autohaus;

/**
 * Car
 */
public abstract class Car {

  protected String model;
  protected int horsePower;
  protected int yearOfFabrication;

  protected Car(String model, int horsePower, int yearOfFabrication) {
    this.model = model;
    this.horsePower = horsePower;
    this.yearOfFabrication = yearOfFabrication;
  }

  public String getModel() {
    return this.model;
  }

  public int getHorsePower() {
    return this.horsePower;
  }

  public int getYearOfFabrication() {
    return this.yearOfFabrication;
  }

  protected abstract void printBrandSlogan();

  @Override
  public String toString() {
    String className = this.getClass().getSimpleName();
    return (
      className +
      " [horsePower=" +
      horsePower +
      ", model=" +
      model +
      ", yearOfFabrication=" +
      yearOfFabrication +
      ", "
    );
  }
}
