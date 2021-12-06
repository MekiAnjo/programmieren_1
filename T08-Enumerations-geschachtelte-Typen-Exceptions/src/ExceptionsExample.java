import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsExample {

  public static int subtractNatural(int a, int b) throws MyOwnException {
    if (b >= a) {
      throw new MyOwnException("Der Subtrahent ist zu groß?");
    }
    return a - b;
  }

  public static void main(String[] args) {
    try {
      System.out.println(subtractNatural(5, 6));
    } catch (MyOwnException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
