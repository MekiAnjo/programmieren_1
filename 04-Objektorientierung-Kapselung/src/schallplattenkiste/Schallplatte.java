package schallplattenkiste;

public class Schallplatte {

  private String title;
  private String interpreter;

  public Schallplatte(String title, String interpreter) {
    this.title = title;
    this.interpreter = interpreter;
  }

  public String getInterpreter() {
    return this.interpreter;
  }

  public String getTitle() {
    return this.title;
  }

  @Override
  public String toString() {
    return (
      "{" +
      " title='" +
      getTitle() +
      "'" +
      ", interpreter='" +
      getInterpreter() +
      "'" +
      "}"
    );
  }
}
