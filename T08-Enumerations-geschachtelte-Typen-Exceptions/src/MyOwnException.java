public class MyOwnException extends Exception {

  public MyOwnException() {
    super("Hier wurde etwas falsch gemacht!!!");
  }

  public MyOwnException(String message) {
    super(message);
  }
}
