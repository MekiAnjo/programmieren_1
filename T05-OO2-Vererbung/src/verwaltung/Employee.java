package verwaltung;

public abstract class Employee {

  private String lastName;
  private String firstName;
  private int salary;

  protected Employee(String lastName, String firstName, int salary) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.salary = salary;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setVorname(String firstName) {
    this.firstName = firstName;
  }

  public int getSalary() {
    return this.salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Name: " + firstName + " " + lastName;
  }
}
