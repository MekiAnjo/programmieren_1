package schallplattenkiste;

public class Schallplatte {

  private String title;
  private String interpreter;

  public Schallplatte(String title, String interpreter) {
    this.title = title;
    this.interpreter = interpreter;
  }

  public String getTitle() {
    return this.title;
  }

  public String getInterpreter() {
    return this.interpreter;
  }
}
