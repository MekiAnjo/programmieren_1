import java.util.Comparator;

public class ElementComparator implements Comparator<Element> {

  @Override
  public int compare(Element o1, Element o2) {
    return o2.getAtomicNumber() - o1.getAtomicNumber();
  }
}
