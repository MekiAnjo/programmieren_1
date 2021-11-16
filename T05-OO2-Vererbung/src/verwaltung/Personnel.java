package verwaltung;

public class Personnel extends Employee {

  private int yearOfEmployment;
  private int holydays;

  protected Personnel(
    String lastName,
    String firstName,
    int salary,
    int yearOfEmployment,
    int holidays
  ) {
    super(lastName, firstName, salary);
    this.yearOfEmployment = yearOfEmployment;
    this.holydays = holidays;
  }

  public int getYearOfEmployment() {
    return this.yearOfEmployment;
  }

  public void setYearOfEmployment(int yearOfEmployment) {
    this.yearOfEmployment = yearOfEmployment;
  }

  public int getHolydays() {
    return this.holydays;
  }

  public void setHolydays(int holydays) {
    this.holydays = holydays;
  }

  @Override
  public String toString() {
    return (
      "Angestellter[" +
      super.toString() +
      ", Einstellungsjahr=" +
      getYearOfEmployment() +
      ", Urlaubstage=" +
      getHolydays() +
      ", Gehalt: " +
      getSalary() +
      "]"
    );
  }
}
