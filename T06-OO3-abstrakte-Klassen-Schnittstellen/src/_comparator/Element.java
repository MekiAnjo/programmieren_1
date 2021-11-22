package _comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Element {

  private String name;
  private int atomicNumber;
  private double atomicWeight;
  private boolean isRadioactive;

  public Element(
    String name,
    int atomicNumber,
    double atomicWeight,
    boolean isRadioactive
  ) {
    this.name = name;
    this.atomicNumber = atomicNumber;
    this.atomicWeight = atomicWeight;
    this.isRadioactive = isRadioactive;
  }

  public String getName() {
    return name;
  }

  public int getAtomicNumber() {
    return atomicNumber;
  }

  public double getAtomicWeight() {
    return atomicWeight;
  }

  public boolean isRadioactive() {
    return isRadioactive;
  }

  @Override
  public String toString() {
    return (
      "Name des Elements: " +
      this.getName() +
      "\nOrdnungszahl: " +
      this.getAtomicNumber() +
      "\nAtomgewicht: " +
      this.getAtomicWeight() +
      " units" +
      "\nRadioaktiv: " +
      this.isRadioactive()
    );
  }

  public static void main(String[] args) {
    Element hydrogen = new Element("Wasserstoff", 1, 1.0, false);
    Element uranium = new Element("Uran", 92, 238.02891, true);
    Element molybdenum = new Element("Molybdän", 42, 95.95, false);
    Element calcium = new Element("Calcium", 20, 40.078, false);
    Element actinium = new Element("Actinium", 89, 227.0, true);
    Element platinum = new Element("Platin", 78, 195.084, false);
    Element oxygen = new Element("Sauerstoff", 8, 15.999, false);

    Element[] toxicMixture = {
      hydrogen,
      uranium,
      molybdenum,
      calcium,
      actinium,
      platinum,
      oxygen,
    };
    // 1. Solution
    // Arrays.sort(toxicMixture, new ElementComparator()/** U add this **/);

    // 2. Solution
    Arrays.sort(
      toxicMixture,
      new ElementComparator<Element>()
      /** U add this **/
    );

    // 3. Solution
    Arrays.sort(toxicMixture, Comparator.comparing(Element::getAtomicNumber));

    for (Element element : toxicMixture) {
      System.out.println(element + "\n");
    }
  }
}
