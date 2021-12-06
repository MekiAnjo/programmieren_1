package anonymeinnereklasse;

import java.util.Arrays;
import java.util.Comparator;

public class Student {

  private String name;
  private int matNum;
  private String subject;

  public Student(String name, int matNum, String subject) {
    this.name = name;
    this.matNum = matNum;
    this.subject = subject;
  }

  public String getName() {
    return name;
  }

  public int getMatNum() {
    return matNum;
  }

  public String getSubject() {
    return subject;
  }

  @Override
  public String toString() {
    return (
      "Student [name=" +
      name +
      ", matNum=" +
      matNum +
      ", subject=" +
      subject +
      "]\n"
    );
  }

  public static void main(String[] args) {
    Student baerbel = new Student("Baerbel Meier", 123456, "Innenarchitektur");
    Student heribert = new Student("Heribert Bohne", 215145, "Informatik");
    Student walter = new Student("Walter Lustig", 235711, "Klimaengineering");
    Student mandy = new Student("Mandy Pflaume", 901901, "BWL");
    Student irma = new Student("Irma Flegel", 877123, "Wirtschaftsinformatik");

    Student[] students = { baerbel, heribert, walter, mandy, irma };
    System.out.println(Arrays.toString(students) + "\nunsortiert\n");

    // Arrays.sort(
    //   students,
    //   new Comparator<Student>() { //sort by matNum
    //     @Override
    //     public int compare(Student o1, Student o2) {
    //       return Integer.compare(o1.getMatNum(), o2.getMatNum());
    //     }
    //   }
    // );

    Arrays.sort(
      students,
      (o1, o2) -> Integer.compare(o1.getMatNum(), o2.getMatNum())
    );

    System.out.println(Arrays.toString(students) + "\n");

    Arrays.sort(
      students,
      new Comparator<Student>() { //Sort by name
        @Override
        public int compare(Student o1, Student o2) {
          return o1.getName().compareTo(o2.getName());
        }
      }
    );
    System.out.println(Arrays.toString(students) + "\n");

    Arrays.sort(
      students,
      new Comparator<Student>() { //Sort by subject
        @Override
        public int compare(Student o1, Student o2) {
          return o1.getSubject().compareTo(o2.getSubject());
        }
      }
    );
    System.out.println(Arrays.toString(students));
  }
}
