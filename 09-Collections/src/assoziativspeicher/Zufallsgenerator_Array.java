package assoziativspeicher;

import java.util.Arrays;
import java.util.Random;

public class Zufallsgenerator_Array {

  private static final int MAX_WUERFE = 6000;
  private static final int MAX_DIGIT_OF_WUERFEL = 6;
  private static final Random RAND = new Random();

  public static void main(String[] args) {
    int[] map = new int[MAX_DIGIT_OF_WUERFEL];

    System.out.println(Arrays.toString(map));

    for (int i = 0; i < MAX_WUERFE; i++) {
      int augenzahl = wuerfeln();
      map[augenzahl - 1]++;
    }

    for (int i = 0; i < MAX_DIGIT_OF_WUERFEL; i++) {
      System.out.println((i + 1) + ": " + map[i]);
    }
  }

  private static int wuerfeln() {
    return RAND.nextInt(MAX_DIGIT_OF_WUERFEL) + 1;
  }
}
