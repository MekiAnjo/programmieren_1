package de.hft_stuttgart.huto1bif;

public class Wertebereich {

  public static void main(String[] args) {
    System.out.println("Wertebereich von int");
    System.out.println("Größtes int: " + Integer.MAX_VALUE);
    System.out.println("Kleinstes int: " + Integer.MIN_VALUE);
    System.out.println("Speicherbedarf für ein int: " + Integer.SIZE + " bit");

    System.out.println("Wertebereich von char");
    System.out.println("Größtes char: " + Character.MAX_VALUE);
    System.out.println("Kleinstes char: " + Character.MIN_VALUE);
    System.out.println(
      "Speicherbedarf für ein char: " + Character.SIZE + " bit"
    );
    // und so weiter
  }
}
