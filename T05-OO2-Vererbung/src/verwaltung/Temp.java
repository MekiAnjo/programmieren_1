package verwaltung;

public class Temp extends Employee {

  private int workingHours;

  protected Temp(String lastName, String firstName, int salary, int workingHours) {
    super(lastName, firstName, salary);
    this.workingHours = workingHours;
  }

  public int getWorkingHours() {
    return this.workingHours;
  }

  public void setWorkingHours(int workingHours) {
    this.workingHours = workingHours;
  }

  @Override
  public String toString() {
    return (
      "Aushilfe[" +
      super.toString() +
      ", Arbeitszeit=" +
      getWorkingHours() +
      ", Gehalt: " +
      getSalary() +
      "]"
    );
  }
}
