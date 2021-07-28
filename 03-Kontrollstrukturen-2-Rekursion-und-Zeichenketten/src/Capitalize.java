/**
 * Capitalize
 */
public class Capitalize {

  public static void main(String[] args) {
    System.out.println(capitalize("this is a very special title"));
    System.out.println(capitalize("niko is lazy"));
    System.out.println(capitalize("java is great"));
  }

  private static String capitalize(String string) {
    boolean capitalizeNextChar = true;
    char[] charArr = string.toCharArray();

    for (int i = 0; i < charArr.length; i++) {
      if (capitalizeNextChar) {
        charArr[i] = Character.toUpperCase(charArr[i]);
        capitalizeNextChar = false;
        continue;
      }
      if (Character.isWhitespace(charArr[i])) {
        capitalizeNextChar = true;
      }
    }
    return String.valueOf(charArr);
  }
}
