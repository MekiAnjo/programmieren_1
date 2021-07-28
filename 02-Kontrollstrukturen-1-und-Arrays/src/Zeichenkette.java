import java.util.Scanner;

/**
 * Zeichenkette
 */
public class Zeichenkette {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Zeichenkette: ");
    String eingabe = scanner.nextLine();
    int anzahlZeichen = eingabe.length();
    System.out.println("Anzahl der Zeichen: " + anzahlZeichen);

    long anzahlBuchstaben = eingabe.chars().filter(Character::isLetter).count();
    System.out.println("Anzahl der Buchstaben: " + anzahlBuchstaben);

    System.out.print("Zeichen: ");
    char buchstabe = scanner.next().charAt(0);
    long anzahlBuchstabe = eingabe.chars().filter(c -> c == buchstabe).count();
    System.out.println(
      "Anzahl der Zeichen " + buchstabe + ": " + anzahlBuchstabe
    );

    scanner.close();
  }
}
