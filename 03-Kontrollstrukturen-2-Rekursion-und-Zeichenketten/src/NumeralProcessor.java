/**
 * NumeralProcessor
 */
public class NumeralProcessor {

  public static void main(String[] args) {
    System.out.println(calcdigits(1234));
    System.out.println(calcSumOfDigits(1234567));
  }

  private static int calcdigits(int i) {
    if (i < 0) System.err.println("Wert muss höher als 0 sein");
    if (i < 10) return 1;
    int remainder = i / 10;
    return calcdigits(remainder) + 1;
  }

  private static int calcSumOfDigits(int i) {
    if (i < 0) System.err.println("Wert muss höher als 0 sein");
    if (i < 10) return i;
    int lastDigit = i % 10;
    int remainder = i / 10;
    return calcSumOfDigits(remainder) + lastDigit;
  }
}
