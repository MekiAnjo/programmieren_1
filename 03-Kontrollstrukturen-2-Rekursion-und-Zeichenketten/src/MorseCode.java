/**
 * MorseCode
 */
public class MorseCode {

  public static void main(String[] args) {
    System.out.println(toMorseCode("SOS"));
    System.out.println(toMorseCode("TWEET"));
    System.out.println(toMorseCode("WEST"));
  }

  private static String toMorseCode(String string) {
    StringBuilder sb = new StringBuilder();
    char[] charsArr = string.toCharArray();
    for (int i = 0; i < charsArr.length; i++) {
      switch (charsArr[i]) {
        case 'E' -> sb.append(".");
        case 'O' -> sb.append("- - -");
        case 'S' -> sb.append(". . .");
        case 'T' -> sb.append("-");
        case 'W' -> sb.append(". - -");
        default -> sb.append("?");
      }
      if (
        i != charsArr.length - 1 && !Character.isWhitespace(charsArr[i])
      ) sb.append("   ");
    }
    return sb.toString();
  }
}
