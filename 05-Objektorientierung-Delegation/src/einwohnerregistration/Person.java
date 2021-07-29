package einwohnerregistration;

/**
 * Person
 */
public class Person {

  private String name;
  private Address address;

  public Person(String name, Address address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public void setAddress(String city, int zip) {
    this.address.setCity(city);
    this.address.setZip(zip);
  }

  @Override
  public String toString() {
    return "Person [address=" + address + ", name=" + name + "]";
  }
}
