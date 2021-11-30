package de.hft_stuttgart.huto1bif.a2y_studentenVergleichAnonym;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Studentenvergleich {

  public static void main(String[] args) {
    Student[] studenten = new Student[6];
    studenten[0] = new Student("Baur", "Melanie", "INF", 42);
    studenten[1] = new Student("Speiser", "Sebastian", "INF", 43);
    studenten[2] = new Student("Rausch", "Alexander", "WINF", 44);
    studenten[3] = new Student("Pado", "Ulrike", "WINF", 41);
    studenten[4] = new Student("Knauth", "Stefan", "INF", 48);
    studenten[5] = new Student("Mosler", "Christof", "WINF", 47);

    System.out.println("Wählen Sie ...");
    System.out.println("1 - Nachname");
    System.out.println("2 - Vorname");
    System.out.println("3 - Studiengang");
    System.out.println("4 - Matrikelnummer");
    System.out.println("X - Programmende");

    System.out.print("Ihre Eingabe: ");
    Scanner scanner = new Scanner(System.in);
    Character c = scanner.next().charAt(0);
    System.out.println("c = " + c);

    Comparator<Student> comparator =
      switch (c) {
        case '1' -> Student.getCompareByNachname();
        case '2' -> Student.getCompareByVorname();
        case '3' -> Student.getCompareByStudium();
        case '4' -> Student.getCompareByMatrikel();
        case 'X' -> null;
        default -> null;
      };

    if (comparator != null) {
      Arrays.sort(studenten, comparator);
    }

    for (Student s : studenten) {
      System.out.println(s);
    }

    scanner.close();
  }
}
