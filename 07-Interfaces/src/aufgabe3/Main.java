package aufgabe3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

  public static void main(String[] args) {
    Student[] students = new Student[6];

    students[0] = new Student("Tony Khoa Nam Huynh", 1003166, "Informatik");
    students[1] = new Student("Daniel Kom", 4596251, "Informatik");
    students[2] = new Student("Emre Gezer", 6634304, "Informatik");
    students[3] = new Student("Kevin Tao", 7390357, "Informatik");
    students[4] = new Student("Robert Khoa Van Huynh", 4425492, "Biologie");
    students[5] = new Student("Alex Nekrasov", 6766531, "Mathematik");

    System.out.println(Arrays.toString(students));

    Arrays.sort(students, new Student.ByMatrikelNr());

    System.out.println();
    System.out.println("byMatrikelnummer: ");
    System.out.println(Arrays.toString(students));

    Arrays.sort(students, new Student.ByName<Student>());

    System.out.println();
    System.out.println("byName: ");
    System.out.println(Arrays.toString(students));

    Arrays.sort(
      students,
      new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
          return ((Student) o1).getStudienfach()
            .compareTo(((Student) o2).getStudienfach());
        }
      }
    );

    // Gleiche wie oben nur als Lambda
    Arrays.sort(
      students,
      (o1, o2) ->
        ((Student) o1).getStudienfach()
          .compareTo(((Student) o2).getStudienfach())
    );

    // Ohne unnötige Casts
    Arrays.sort(
      students,
      (o1, o2) -> (o1).getStudienfach().compareTo((o2).getStudienfach())
    );

    // Beste Lösung?
    Arrays.sort(students, Comparator.comparing(Student::getStudienfach));

    // Basically gleiche Lösung nur für Listen
    Collections.sort(
      Arrays.asList(students),
      Comparator.comparing(Student::getStudienfach)
    );

    // Geht auch, aber nicht so gut denke ich
    students =
      (Student[]) Arrays
        .stream(students)
        .sorted(Comparator.comparing(Student::getStudienfach))
        .toArray();

    System.out.println();
    System.out.println("byStudiengang: ");
    System.out.println(Arrays.toString(students));
  }
}
