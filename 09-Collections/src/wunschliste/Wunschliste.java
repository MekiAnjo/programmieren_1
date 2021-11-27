package wunschliste;

import java.util.ArrayList;

public class Wunschliste extends ArrayList<String> {

  public void add(String... str) {
    for (String string : str) {
      add(string);
    }
  }
}
