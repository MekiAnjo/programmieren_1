package Cars;

public class Audi extends Car {

  private String features;

  Audi(String model, int horsePower, int yearOfFabrication, String features) {
    super(model, horsePower, yearOfFabrication);
    this.features = features;
  }

  public String getFeatures() {
    return features;
  }

  @Override
  public void printBrandSlogan() {
    System.out.println("Vorsprung durch Technik.");
  }
}
