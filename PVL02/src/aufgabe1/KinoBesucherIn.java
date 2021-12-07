package aufgabe1;

public class KinoBesucherIn {

  private String name;
  private int alter;
  private boolean ermaessigt;
  private double eintrittspreis;

  public KinoBesucherIn(String name, int alter, boolean ermaessigt) {
    this.name = name;
    this.alter = alter;
    this.ermaessigt = ermaessigt;
  }

  public void filmBesuchen(Film film) {
    if (alter < film.getAltersbeschraenkung()) {
      System.out.println("Kein Zutritt!");
      return;
    }
    eintrittspreis = (ermaessigt) ? film.getPreis() - 2.50 : film.getPreis();
    System.out.println(film.getFilmInfo());
    System.out.printf("Der Eintrittspreis beträgt: %.2f€%n", eintrittspreis);
    System.out.println("Viel Spaß!");
  }
}
