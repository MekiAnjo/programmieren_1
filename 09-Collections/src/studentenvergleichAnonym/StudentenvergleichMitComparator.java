package studentenvergleichAnonym;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentenvergleichMitComparator {

  public static void main(String[] args) {
    Student studenten[] = new Student[6];
    studenten[0] = new Student("Baur", "Melanie", "INF", 42);
    studenten[1] = new Student("Speiser", "Sebastian", "INF", 43);
    studenten[2] = new Student("Rausch", "Alexander", "WINF", 44);
    studenten[3] = new Student("Pado", "Ulrike", "WINF", 41);
    studenten[4] = new Student("Knauth", "Stefan", "INF", 48);
    studenten[5] = new Student("Mosler", "Christof", "WINF", 47);

    System.out.println("W�hlen Sie ...");
    System.out.println("1 - Nachname");
    System.out.println("2 - Vorname");
    System.out.println("3 - Studiengang");
    System.out.println("4 - Matrikelnummer");
    System.out.println("0 - Programmende");

    System.out.print("Bitte w�hlen Sie nun Ihre Eingabe: ");
    Scanner scanner = new Scanner(System.in);
    Integer eingabe = scanner.nextInt();
    System.out.println("Ihre ausgew�hlte Eingabe ist: " + eingabe);
    scanner.close();

    Comparator<Student> comparator = null;

    switch (eingabe) {
      case 1:
        comparator = Student.compareByNachname();
        break;
      case 2:
        comparator = Student.compareByVorname();
        break;
      case 3:
        comparator = Student.compareByStudiengang();
        break;
      case 4:
        comparator = Student.compareByMatrikelnummer();
        break;
      case 0:
        comparator = null;
        break;
    }

    if (comparator != null) {
      Arrays.sort(studenten, comparator);
      System.out.println("Es wurde sortiert.");

      for (Student s : studenten) {
        System.out.println(s);
      }
    } else {
      System.out.println(
        "Es wurde nichts sortiert - das Programm ist zu Ende."
      );
    }
  }
}
