package kofferPacken;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KofferPacken {

  public static void main(String[] args) {
    List<String> koffer = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println(
        "Bitte geben Sie ein, was Sie in Ihren Koffer packen: "
      );
      String gegenstand = scanner.nextLine();
      koffer.add(gegenstand);

      boolean geraten = checkKoffer(koffer, scanner);
      if (!geraten) {
        System.out.println("Das Spiel ist zu Ende.");
        scanner.close();
        break;
      }
    }
  }

  public static boolean checkKoffer(List<String> koffer, Scanner scanner) {
    for (String gegenstand : koffer) {
      System.out.println("Was befindet sich in Ihrem Koffer?");
      String eingabe = scanner.nextLine();
      if (!eingabe.equalsIgnoreCase(gegenstand)) {
        System.out.println("Das war leider falsch.");
        return false;
      } else {
        System.out.println("Richtig.");
      }
    }
    return true;
  }
}
