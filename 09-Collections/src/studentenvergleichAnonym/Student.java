package studentenvergleichAnonym;

import java.util.Comparator;

public class Student {

  private String nachname;
  private String vorname;
  private String studiengang;
  private int matrikelnummer;

  public Student(
    String nachname,
    String vorname,
    String studiengang,
    int matrikelnummer
  ) {
    super();
    this.nachname = nachname;
    this.vorname = vorname;
    this.studiengang = studiengang;
    this.matrikelnummer = matrikelnummer;
  }

  @Override
  public String toString() {
    return String.format(
      "Nachname: %-10s Vorname: %-12s Studiengang: %-7s Matrikelnummer: %d",
      nachname,
      vorname,
      studiengang,
      matrikelnummer
    );
  }

  public static Comparator<Student> compareByNachname() {
    return new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        return o1.nachname.compareTo(o2.nachname);
      }
    };
  }

  public static Comparator<Student> compareByVorname() {
    return new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        return (o1.vorname.compareTo(o2.vorname));
      }
    };
  }

  public static Comparator<Student> compareByStudiengang() {
    return new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        return (o1.studiengang.compareTo(o2.studiengang));
      }
    };
  }

  public static Comparator<Student> compareByMatrikelnummer() {
    return new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        return (o1.matrikelnummer - o2.matrikelnummer);
      }
    };
  }
}
