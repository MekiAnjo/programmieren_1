package de.hft_stuttgart.huto1bif.a2z_studentenVergleichVorlesung;

import java.util.Comparator;

public class VornameComparator implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    return o1.getVorname().compareTo(o2.getVorname());
  }
}
