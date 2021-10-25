import java.util.Scanner;

public class BinaryCheck {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Gebe bitte eine Binäre Zahl ein: ");
    String eingabe = scanner.nextLine();

    System.out.println(
      "Ist die gegebene Zahl eine Binär Zahl?: " + isBinaryNumber(eingabe)
    );
    System.out.print(eingabe + " umgewandelt ins Dezimalsystem: ");
    if (isBinaryNumber(eingabe)) {
      System.out.print(binaryToDecimal(eingabe));
    } else {
      System.out.print("ERROR");
    }

    scanner.close();
  }

  private static boolean isBinaryNumber(String string) {
    return (
      string
        .chars()
        .filter(Character::isDigit)
        .filter(digit -> digit == '0' || digit == '1')
        .count() ==
      string.length()
    );
  }

  private static int binaryToDecimal(String string) {
    if (isBinaryNumber(string)) {
      return string
        .chars()
        .map(digit -> digit - '0')
        .reduce((a, b) -> a * 2 + b)
        .getAsInt();
    }
    return 0;
  }
}
