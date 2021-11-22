package _comparator;

import java.util.Comparator;

public class ElementComparator<T extends Element> implements Comparator<T> {

  @Override
  public int compare(T o1, T o2) {
    return Integer.compare(o1.getAtomicNumber(), o2.getAtomicNumber());
  }
}
