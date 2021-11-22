package autohaus;

/**
 * Audi
 */
public class Audi extends Car {

  private String features;

  public Audi(
    String model,
    int horsePower,
    String features,
    int yearOfFabrication
  ) {
    super(model, horsePower, yearOfFabrication);
    this.features = features;
  }

  public String getFeatures() {
    return this.features;
  }

  @Override
  protected void printBrandSlogan() {
    System.out.println("Audi: \"Vorsprung durch Technik\"");
  }

  @Override
  public String toString() {
    return super.toString() + "features=" + features + "]";
  }
}
