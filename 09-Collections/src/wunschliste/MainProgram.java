package wunschliste;

public class MainProgram {

  public static void main(String[] args) {
    Wunschliste wunsch = new Wunschliste();

    wunsch.add("Puppe");
    wunsch.add("Puzzle", "Kuscheltier", "Buch");

    wunsch.forEach(System.out::println);
  }
}
