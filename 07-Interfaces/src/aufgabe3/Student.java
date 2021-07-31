package aufgabe3;

import java.util.Comparator;

public class Student {

  private String name;
  private int matrikelNummer;
  private String studienfach;

  public Student(String name, int matrikelNummer, String studienfach) {
    this.name = name;
    this.matrikelNummer = matrikelNummer;
    this.studienfach = studienfach;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMatrikelNummer() {
    return this.matrikelNummer;
  }

  public void setMatrikelNummer(int matrikelNummer) {
    this.matrikelNummer = matrikelNummer;
  }

  public String getStudienfach() {
    return this.studienfach;
  }

  public void setStudienfach(String studienfach) {
    this.studienfach = studienfach;
  }

  @Override
  public String toString() {
    return (
      "{" +
      " name='" +
      getName() +
      "'" +
      ", matrikelNummer='" +
      getMatrikelNummer() +
      "'" +
      ", studienfach='" +
      getStudienfach() +
      "'" +
      "}"
    );
  }

  // static class ByName implements Comparator {

  //   @Override
  //   public int compare(Object o1, Object o2) {
  //     return ((Student) o1).getName().compareTo(((Student) o2).getName());
  //   }
  // }

  static class ByName<T extends Student> implements Comparator<T> {

    // @Override
    // public int compare(Object o1, Object o2) {
    //   return ((Student) o1).getName().compareTo(((Student) o2).getName());
    // }

    @Override
    public int compare(T o1, T o2) {
      return o1.getName().compareTo(o2.getName());
    }
  }

  static class ByMatrikelNr implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
      return Integer.compare(
        ((Student) o1).matrikelNummer,
        ((Student) o2).matrikelNummer
      );
    }
  }
}
