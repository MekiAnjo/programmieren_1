package de.hft_stuttgart.huto1bif.a2z_studentenVergleichVorlesung;

import java.util.Comparator;

public class MatrikelnummerComparator implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    return (o1.getMatrikelnummer() - o2.getMatrikelnummer());
  }
}
