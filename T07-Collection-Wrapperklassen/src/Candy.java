public class Candy {

  private String brand;
  private double price;

  public Candy(String brand, double price) {
    super();
    this.brand = brand;
    this.setPrice(price);
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getBrand() {
    return brand;
  }

  @Override
  public String toString() {
    return "Candy [brand=" + brand + ", price=" + price + "]";
  }
}
