/**
 * BinaryCheck
 */
public class BinaryCheck {

  public static void main(String[] args) {
    System.out.println(isBinaryNumber("10101"));
    System.out.println(binaryToDecimal("111"));
  }

  private static boolean isBinaryNumber(String string) {
    long numberCount = string
      .chars()
      .filter(Character::isDigit)
      .filter(d -> d == '0' || d == '1')
      .count();
    return numberCount == string.length();
  }

  private static int binaryToDecimal(String string) {
    if (isBinaryNumber(string)) {
      return string
        .chars()
        .map(c -> c - '0')
        .reduce((x, y) -> x * 2 + y)
        .getAsInt();
    }
    return 0;
  }
}
