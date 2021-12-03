package ratespiel;

import java.util.Random;
import java.util.Scanner;

public class Ratespiel_Musterloesung {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    final int UPPER_BOUND = 100;
    int userInput, randomNumber;
    int counter = 0;
    String decision = "y";

    while (decision.equalsIgnoreCase("Y")) {
      randomNumber = rand.nextInt(UPPER_BOUND);
      // hint der später gelöscht werden muss
      System.out.println("Richtige Zahl: " + randomNumber);

      System.out.println(
        "gesuch ist eine Zahl zwischen 1 und " + UPPER_BOUND + ". Raten Sie!"
      );
      userInput = scan.nextInt();
      counter++;

      while (userInput != randomNumber) {
        System.out.println("Falsch geraten...");

        if (randomNumber > userInput) {
          System.out.println("Die gesuchte Zahl ist grösser...");
        } else {
          System.out.println("Die gesuchte Zahl ist kleiner...");
        }
        System.out.println("Versuchen Sie es nocheinmal...");
        userInput = scan.nextInt();
        counter++;
      }
      System.out.println("Korrekt geraten!");
      System.out.println("Sie haben " + counter + " Versuche benötigt.");

      System.out.println("Möchten Sie noch eine Runder spielen? (y/n)");
      decision = scan.next();
    }
  }
}
