package einwohnerregistration;

/**
 * Address
 */
public class Address {

  private String city;
  private int zip;

  public Address(String city, int zip) {
    this.city = city;
    this.zip = zip;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getZip() {
    return this.zip;
  }

  public void setZip(int zip) {
    this.zip = zip;
  }
}
