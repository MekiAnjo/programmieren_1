package de.hft_stuttgart.huto1bif.a2y_studentenVergleichAnonym;

import java.util.Comparator;

public class Student {

  private String name;
  private String vorname;
  private String studium;
  private int matrikel;

  public Student(String name, String vorname, String studium, int matrikel) {
    this.name = name;
    this.vorname = vorname;
    this.studium = studium;
    this.matrikel = matrikel;
  }

  @Override
  public String toString() {
    return (
      "Student{" +
      "name=" +
      name +
      ", vorname=" +
      vorname +
      ", studium=" +
      studium +
      ", matrikel=" +
      matrikel +
      '}'
    );
  }

  public static Comparator<Student> getCompareByNachname() {
    return new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
      }
    };
    // return (o1, o2) -> o1.name.compareTo(o2.name);
  }

  public static Comparator getCompareByVorname() {
    return new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {
        return ((Student) o1).vorname.compareTo(((Student) o2).vorname);
      }
    };
  }

  public static Comparator getCompareByStudium() {
    return new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {
        return ((Student) o1).studium.compareTo(((Student) o2).studium);
      }
    };
  }

  public static Comparator getCompareByMatrikel() {
    return new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {
        return ((Student) o1).matrikel - ((Student) o2).matrikel;
      }
    };
  }
}
