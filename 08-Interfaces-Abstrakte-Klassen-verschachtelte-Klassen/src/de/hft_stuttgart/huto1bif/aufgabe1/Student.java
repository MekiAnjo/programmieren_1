package de.hft_stuttgart.huto1bif.aufgabe1;

public class Student implements Comparable {

  private String nachname;
  private String vorname;
  private String studiengang;
  private int matNr;

  public Student(String nachname, String vorname, String sg, int matNummer) {
    this.nachname = nachname;
    this.vorname = vorname;
    this.studiengang = sg;
    this.matNr = matNummer;
  }

  @Override
  public String toString() {
    return vorname + " " + nachname + " (" + matNr + "): " + studiengang;
  }

  @Override
  public int compareTo(Object o) {
    return nachname.compareTo(((Student) o).nachname);
  }

  public String getNachname() {
    return nachname;
  }

  public void setNachname(String nachname) {
    this.nachname = nachname;
  }

  public String getVorname() {
    return vorname;
  }

  public void setVorname(String vorname) {
    this.vorname = vorname;
  }

  public String getStudiengang() {
    return studiengang;
  }

  public void setStudiengang(String studiengang) {
    this.studiengang = studiengang;
  }

  public int getMatNr() {
    return matNr;
  }

  public void setMatNr(int matNr) {
    this.matNr = matNr;
  }
}
