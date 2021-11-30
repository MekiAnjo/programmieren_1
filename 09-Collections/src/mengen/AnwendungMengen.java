package mengen;

public class AnwendungMengen {

  public static void main(String[] args) {
    MathSet a = new MathSet('a', 'b', 'c');
    MathSet b = new MathSet('b', 'c', 'd', 'e');

    MathSet c = MathSet.intersection(a, b);
    MathSet d = MathSet.union(a, b);
    MathSet e = MathSet.difference(a, b);
    MathSet f = MathSet.difference(b, a);

    System.out.println("A:               " + a);
    System.out.println("B:               " + b);
    System.out.println("A geschnitten B: " + c);
    System.out.println("A vereinigt B:   " + d);
    System.out.println("A ohne B:        " + e);
    System.out.println("B ohne A:        " + f);
  }
}
