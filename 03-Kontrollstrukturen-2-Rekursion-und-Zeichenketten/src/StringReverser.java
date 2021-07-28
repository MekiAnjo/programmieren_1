/**
 * StringReverser
 */
public class StringReverser {

  public static void main(String[] args) {
    System.out.println(reverse("ABCD"));
    System.out.println(reverse("OTTO"));
    System.out.println(reverse("PETER"));
  }

  private static String reverse(String string) {
    char[] charArr = string.toCharArray();
    for (int i = 0; i < charArr.length / 2; i++) {
      char a = charArr[i];
      char b = charArr[charArr.length - 1 - i];

      charArr[i] = b;
      charArr[charArr.length - 1 - i] = a;
    }
    return String.valueOf(charArr);
  }
}
