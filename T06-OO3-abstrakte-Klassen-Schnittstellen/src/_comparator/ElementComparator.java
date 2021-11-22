package _comparator;

import java.util.Comparator;

public class ElementComparator implements Comparator<Element> {

  @Override
  public int compare(Element o1, Element o2) {
    return Integer.compare(o1.getAtomicNumber(), o2.getAtomicNumber());
  }
}
