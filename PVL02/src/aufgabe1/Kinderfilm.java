package aufgabe1;

public class Kinderfilm extends Film {

  private boolean animation;

  protected Kinderfilm(
    String name,
    int laenge,
    int altersbeschraenkung,
    boolean animation
  ) {
    super(name, laenge, altersbeschraenkung);
    this.animation = animation;
  }

  @Override
  public String getFilmInfo() {
    return (
      "Name: " +
      name +
      ", Filmlänge: " +
      laenge +
      " Min, Animation: " +
      animation
    );
  }
}
