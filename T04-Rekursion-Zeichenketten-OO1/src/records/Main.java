package records;

import java.util.Scanner;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    RecordBox myBox = new RecordBox();

    run(myBox);
  }

  private static void run(RecordBox box) {
    Scanner sc = new Scanner(System.in);

    boolean isProgrammRunning = true;

    while (isProgrammRunning) {
      System.out.println("Was möchtest du tun?");
      System.out.println(
        "1 Schallplatte hinzufügen" +
        "| 2 Schallplatten auflisten" +
        "| 3 Schallplatte löschen" +
        "| 4 Programm beenden"
      );
      System.out.print("Auswahl: ");
      int input = sc.nextInt();
      sc.nextLine(); // exist so it can consume the return character

      switch (input) {
        case 1 -> {
          System.out.println("Gebe den Titel und Artisten der Schallplatte an");
          System.out.print("Titel: ");
          String title = sc.nextLine();
          System.out.print("Artist: ");
          String artist = sc.nextLine();
          box.addRecord(new Record(title, artist));
        }
        case 2 -> box.printBoxContent();
        case 3 -> {
          System.out.println(
            "Gebe den Index der zu löschenden Schallplatte an"
          );
          System.out.print("Index: ");
          int index = sc.nextInt();
          box.removeRecord(index);
        }
        case 4 -> {
          isProgrammRunning = false;
          System.out.println("Bye!");
        }
        default -> System.out.println(
          "Ungültige Eingabe, bitte erneut eingeben"
        );
      }
      System.out.println();
    }
    sc.close();
  }
}
