package Cars;

public class BMW extends Car {

  private boolean isLeased;

  BMW(String model, int horsePower, int yearOfFabrication, boolean isLeased) {
    super(model, horsePower, yearOfFabrication);
    this.isLeased = isLeased;
  }

  public boolean isLeased() {
    return isLeased;
  }

  @Override
  public void printBrandSlogan() {
    System.out.println("Freude am Fahren.");
  }
}
