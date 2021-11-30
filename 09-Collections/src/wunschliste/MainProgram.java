package wunschliste;

public class MainProgram {

  public static void main(String[] args) {
    Wunschliste wunsch = new Wunschliste();

    // Teilaufgabe a)
    // Methoden der Klasse ArrayList werden geerbt und sind aufrufbar
    wunsch.add("Puppe");

    // Teilaufgabe b)
    wunsch.add("Puzzle", "Kuscheltier", "Buch");

    wunsch.forEach(System.out::println);
  }
}
