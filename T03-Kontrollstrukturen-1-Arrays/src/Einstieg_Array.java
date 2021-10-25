public class Einstieg_Array {

  public static void main(String[] args) {
    int[] myArray1 = new int[5];
    myArray1[0] = 0;
    myArray1[1] = 2;
    myArray1[2] = 4;
    myArray1[3] = 6;
    myArray1[4] = 8;
    int[] myArray2 = new int[3];
    myArray2[0] = 1;
    myArray2[1] = 3;
    myArray2[2] = 5;

    System.out.println(myArray1.length); // 1.
    System.out.println(myArray2.length); // 2.
    System.out.println("Ergebnis: " + myArray1[1]); // 3.
    System.out.println("Ergebnis: " + myArray2[1]); // 4.
    System.out.println("Ergebnis: " + myArray1[3]); // 5.
    System.out.println("Ergebnis: " + myArray1[4]); // 6.
    System.out.println(myArray1.length - 1); // 7.
    System.out.println(myArray2.length - 1); // 8.
    System.out.println("Ergebnis: " + myArray1[0]); // 9.
    System.out.println("Ergebnis: " + myArray2[0]); // 10.

    //  char[] a1 = {’A’, ’B’, ’C’};
    //  String[] a2 = new String[];
    //  []int a3 = new int[3];
    // double[][] a4 = new double[4];
    int[][] a5 = { { 4, 2 }, { 7 }, {} };
    //  String[] = new String[4];
  }
}
