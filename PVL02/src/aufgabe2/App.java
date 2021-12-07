package aufgabe2;

public abstract class App implements Comparable<App> {

  protected String name;
  protected double speicherplatzverbrauch;

  protected App(String name, double speicherplatzverbrauch) {
    this.name = name;
    this.speicherplatzverbrauch = speicherplatzverbrauch;
  }

  @Override
  public int compareTo(App o) {
    return (int) (this.speicherplatzverbrauch - o.speicherplatzverbrauch);
  }

  public abstract String installieren();

  @Override
  public String toString() {
    return (
      "App [name=" +
      name +
      ", speicherplatzverbrauch=" +
      speicherplatzverbrauch +
      "]"
    );
  }
}
