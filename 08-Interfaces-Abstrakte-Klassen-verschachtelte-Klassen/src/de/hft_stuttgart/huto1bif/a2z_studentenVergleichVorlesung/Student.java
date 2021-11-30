package de.hft_stuttgart.huto1bif.a2z_studentenVergleichVorlesung;

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

  public int getMatrikelnummer() {
    return matrikelnummer;
  }

  public void setMatrikelnummer(int matrikelnummer) {
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
}
