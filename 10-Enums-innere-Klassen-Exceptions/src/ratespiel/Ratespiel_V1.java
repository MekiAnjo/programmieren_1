package ratespiel;

import java.util.Random;
import java.util.Scanner;

public class Ratespiel_V1 {

  private static final Random RAND = new Random();
  private static final int UPPER_BOUND = 100;
  private static final Scanner SCAN = new Scanner(System.in);

  public static void main(String[] args) {
    int randomNumber = getRandomNumber();
    int userInput = 0;
    int counter = 0;
    System.out.println("Zu erratene Zahl: " + randomNumber);

    do {
      System.out.print("Deine Eingabe: ");
      userInput = SCAN.nextInt();
      counter++;
    } while (checkNumber(userInput, randomNumber));
    System.out.println("Anzahl der Versuche: " + counter);
  }

  private static int getRandomNumber() {
    return RAND.nextInt(UPPER_BOUND) + 1;
  }

  private static boolean checkNumber(int userInput, int randomNumber) {
    if (userInput == randomNumber) {
      System.out.println("Richtig!");
      return false;
    }
    if (userInput > randomNumber) {
      System.out.println("kleiner!");
    } else {
      System.out.println("Höher!");
    }
    return true;
  }
}
