package aufgabe2;

public class SocialMediaApp extends App implements StandortVerwenden {

  protected SocialMediaApp(String name, double speicherplatzverbrauch) {
    super(name, speicherplatzverbrauch);
    standortVerwenden();
  }

  @Override
  public String installieren() {
    return (
      "Name: " +
      name +
      " , Speicherverbrauch: " +
      speicherplatzverbrauch +
      " MB"
    );
  }

  @Override
  public void standortVerwenden() {
    System.out.println("Die App " + name + " verwendet Ihren Standort");
  }
}
