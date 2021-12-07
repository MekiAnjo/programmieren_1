package aufgabe2;

public class SpielApp extends App {

  String typ;

  protected SpielApp(String name, double speicherplatzverbrauch, String typ) {
    super(name, speicherplatzverbrauch);
    this.typ = typ;
  }

  @Override
  public String installieren() {
    return (
      "Name: " +
      name +
      " , Speicherverbrauch: " +
      speicherplatzverbrauch +
      " MB, Typ: " +
      typ
    );
  }
}
