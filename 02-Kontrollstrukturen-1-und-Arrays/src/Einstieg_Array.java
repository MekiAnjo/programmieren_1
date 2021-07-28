/**
 * Arrays
 */
public class Einstieg_Array {

  public static void main(String[] args) {
    int[] meinArray1 = new int[5];
    meinArray1[0] = 0;
    meinArray1[1] = 2;
    meinArray1[2] = 4;
    meinArray1[3] = 6;
    meinArray1[4] = 8;

    int[] meinArray2 = new int[3];
    meinArray1[0] = 1;
    meinArray1[1] = 3;
    meinArray1[2] = 5;

    // 1.
    System.out.println(meinArray1.length);

    // 2.
    System.out.println(meinArray2.length);

    // 3.
    System.out.println("Ergebnis: " + meinArray1[1]);

    // 4.
    System.out.println("Ergebnis: " + meinArray2[1]);

    // 5.
    System.out.println("Ergebnis: " + meinArray1[3]);

    // 6.
    System.out.println("Ergebnis: " + meinArray1[4]);

    // 7.
    System.out.println(meinArray1.length - 1);

    // 8.
    System.out.println(meinArray2.length - 1);

    // 9.
    System.out.println("Ergebnis: " + meinArray1[0]);

    // 10.
    System.out.println("Ergebnis: " + meinArray2[0]);
  }
}
