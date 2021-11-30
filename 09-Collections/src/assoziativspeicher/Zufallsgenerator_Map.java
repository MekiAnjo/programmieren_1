package assoziativspeicher;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Zufallsgenerator_Map {

  private static final int MAX_WUERFE = 6000;
  private static final int MAX_DIGIT_OF_WUERFEL = 6;
  private static final Random RAND = new Random();

  public static void main(String[] args) {
    Iterator<Integer> random = new RandomIterator(MAX_DIGIT_OF_WUERFEL);

    Map<Integer, Integer> map = new HashMap<>();
    map.put(1, 0);
    map.put(2, 0);
    map.put(3, 0);
    map.put(4, 0);
    map.put(5, 0);
    map.put(6, 0);

    System.out.println(map);

    for (int i = 0; i < MAX_WUERFE; i++) {
      int dice = random.next() + 1;
      map.put(dice, map.get(dice) + 1);
      // Integer augenzahl = wuerfeln();
      // map.put(augenzahl, map.get(augenzahl) + 1);
    }

    System.out.println(map);
  }
}
