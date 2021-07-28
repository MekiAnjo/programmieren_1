package composition;

public class Engine {

  private String type;
  private int horsepower;

  public Engine(String type, int horsepower) {
    this.type = type;
    this.horsepower = horsepower;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getHorsepower() {
    return this.horsepower;
  }

  public void setHorsepower(int horsepower) {
    this.horsepower = horsepower;
  }
}
