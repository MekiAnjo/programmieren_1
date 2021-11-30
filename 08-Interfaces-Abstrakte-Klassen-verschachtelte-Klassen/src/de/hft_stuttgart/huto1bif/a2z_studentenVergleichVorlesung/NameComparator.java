package de.hft_stuttgart.huto1bif.a2z_studentenVergleichVorlesung;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    return o1.getNachname().compareTo(o2.getNachname());
  }
}
