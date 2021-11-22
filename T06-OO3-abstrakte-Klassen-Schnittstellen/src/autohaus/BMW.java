package autohaus;

/**
 * BMW
 */
public class BMW extends Car {

  private boolean isLeased;

  public BMW(
    String model,
    int horsePower,
    boolean isLeased,
    int yearOfFabrication
  ) {
    super(model, horsePower, yearOfFabrication);
    this.isLeased = isLeased;
  }

  public boolean getIsLeased() {
    return this.isLeased;
  }

  public boolean isIsLeased() {
    return this.isLeased;
  }

  @Override
  protected void printBrandSlogan() {
    System.out.println("BMW: \"Freude am Fahren\"");
  }

  @Override
  public String toString() {
    return super.toString() + "isLeased=" + isLeased + "]";
  }
}
