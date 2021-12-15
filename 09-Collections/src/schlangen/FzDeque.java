package schlangen;

import java.util.ArrayDeque;
import java.util.Arrays;

public class FzDeque extends ArrayDeque<String> {

  public FzDeque(String... string) {
    // kürzere Variante
    // Arrays.asList(string);

    for (String s : string) {
      super.add(s);
    }
  }
}
