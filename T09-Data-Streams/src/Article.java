public class Article {

  private String name;
  private String brand;
  private double price;

  public Article(String name, String brand, double price) {
    super();
    this.name = name;
    this.brand = brand;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public String getBrand() {
    return brand;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return (
      "Name:" + this.name + "-Marke:" + this.brand + "-Preis:" + this.price
    );
  }
}
