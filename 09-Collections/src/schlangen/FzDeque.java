package schlangen;

import java.util.ArrayDeque;

public class FzDeque extends ArrayDeque<String> {

  public FzDeque(String... string) {
    for (String s : string) {
      super.add(s);
    }
  }
}
