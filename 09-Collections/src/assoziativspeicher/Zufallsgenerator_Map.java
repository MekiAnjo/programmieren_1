package assoziativspeicher;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Zufallsgenerator_Map {

  private static final int MAX_WUERFE = 6000;
  private static final int MAX_DIGIT_OF_WUERFEL = 6;

  public static void main(String[] args) {
    Iterator<Integer> random = new RandomIterator(MAX_DIGIT_OF_WUERFEL);

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 1; i <= MAX_DIGIT_OF_WUERFEL; i++) {
      map.put(i, 0);
    }

    System.out.println(map);

    for (int i = 0; i < MAX_WUERFE; i++) {
      int dice = random.next() + 1;
      map.put(dice, map.get(dice) + 1);
    }

    System.out.println(map);
  }
}
