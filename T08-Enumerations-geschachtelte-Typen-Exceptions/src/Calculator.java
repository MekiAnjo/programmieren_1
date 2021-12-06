public class Calculator {

  public static Double returnDouble(Number a) {
    return a.doubleValue();
  }

  public static void main(String[] args) {
    int i = 7;
    returnDouble(i);
  }
}
