package mengen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MathSet {

  private Set<Character> elements;

  public MathSet(Character... elements) {
    this.elements = new HashSet<Character>();
    this.elements.addAll(Arrays.asList(elements));
  }

  MathSet(Set<Character> set) {
    this.elements = new HashSet<Character>();
    this.elements.addAll(set);
  }

  public Set<Character> getElements() {
    return elements;
  }

  @Override
  public String toString() {
    return "[" + elements + "]";
  }

  public static MathSet intersection(MathSet a, MathSet b) {
    MathSet ergebnis = new MathSet(a.getElements());
    ergebnis.elements.retainAll(b.elements);
    return ergebnis;
  }

  public static MathSet union(MathSet a, MathSet b) {
    MathSet ergebnis = new MathSet(a.getElements());
    ergebnis.elements.addAll(b.elements);
    return ergebnis;
  }

  public static MathSet difference(MathSet a, MathSet b) {
    MathSet ergebnis = new MathSet(a.getElements());
    ergebnis.elements.removeAll(b.elements);
    return ergebnis;
  }
}
