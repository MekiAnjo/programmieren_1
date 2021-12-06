package wunschliste;

import java.util.ArrayList;
import java.util.Arrays;

public class Wunschliste extends ArrayList<String> {

  // public void add(String... elements) {
  //   for (String string : elements) {
  //     add(string);
  //   }
  // }
  public void add(String... elements) {
    addAll(Arrays.asList(elements));
  }
}
