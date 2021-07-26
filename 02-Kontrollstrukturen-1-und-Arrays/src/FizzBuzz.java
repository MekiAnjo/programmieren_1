/**
 * FizzBuzz
 */
public class FizzBuzz {

  public static void main(String[] args) {
    // for (int i = 1; i <= 100; i++) {
    //   if (i % 5 == 0 && i % 7 == 0) {
    //     System.out.println("FizzBuzz");
    //     continue;
    //   }
    //   if (i % 5 == 0) {
    //     System.out.println("Fizz");
    //     continue;
    //   }
    //   if (i % 7 == 0) {
    //     System.out.println("Buzz");
    //     continue;
    //   }
    //   System.out.println(i);
    // }

    fizzBuzz();
  }

  private static void fizzBuzz() {
    for (int i = 1; i <= 100; i++) {
      String s = "";
      if (i % 5 == 0) s = "Fizz";
      if (i % 7 == 0) s += "Buzz";
      System.out.println(s.equals("") ? i : s);
    }
  }
}
