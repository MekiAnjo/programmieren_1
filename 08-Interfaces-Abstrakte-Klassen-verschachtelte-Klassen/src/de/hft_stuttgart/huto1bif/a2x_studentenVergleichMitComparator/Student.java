/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hft_stuttgart.huto1bif.a2x_studentenVergleichMitComparator;

import java.util.Comparator;

/**
 *
 * @author rausch
 */
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

  public static Comparator getCompareByNachname() {
    return new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {
        return ((Student) o1).name.compareTo(((Student) o2).name);
      }
    };
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
