package verschachteltetypen;

public class IceCream {

  private Scoop scoop1;
  private Scoop scoop2;
  private Scoop scoop3;

  // public Scoop getScoop1() {
  //   return scoop1;
  // }

  // public Scoop getScoop2() {
  //   return scoop2;
  // }

  // public Scoop getScoop3() {
  //   return scoop3;
  // }

  enum Flavour {
    VANILLA,
    RASPBERRY,
    STRAWBERRRY,
    SALTED_CARAMELL,
    YOGHURT,
    LEMON,
    CHOCOLATE,
  }

  enum Size {
    HUGE,
    MODERATE,
    SMALL,
  }

  static class Scoop {

    Flavour flavour;
    Size size;

    Scoop(Flavour flavour, Size size) {
      this.flavour = flavour;
      this.size = size;
    }

    public Flavour getFlavour() {
      return flavour;
    }

    public Size getSize() {
      return size;
    }
  }

  IceCream(Scoop scoop1, Scoop scoop2, Scoop scoop3) {
    this.scoop1 = scoop1;
    this.scoop2 = scoop2;
    this.scoop3 = scoop3;
  }

  public static Scoop chooseScoop(Flavour flavor, Size size) {
    return new Scoop(flavor, size);
  }

  @Override
  public String toString() {
    return (
      "Kugel 1: " +
      scoop1.getFlavour() +
      ", " +
      scoop1.getSize() +
      "\n" +
      "Kugel 2: " +
      scoop2.getFlavour() +
      ", " +
      scoop2.getSize() +
      "\n" +
      "Kugel 3: " +
      scoop3.getFlavour() +
      ", " +
      scoop3.getSize()
    );
  }

  // @Override
  // public String toString() {
  //   return (
  //     "Kugel 1: " +
  //     getScoop1().getFlavour() +
  //     ", " +
  //     getScoop1().getSize() +
  //     "\n" +
  //     "Kugel 2: " +
  //     getScoop2().getFlavour() +
  //     ", " +
  //     getScoop2().getSize() +
  //     "\n" +
  //     "Kugel 3: " +
  //     getScoop3().getFlavour() +
  //     ", " +
  //     getScoop3().getSize()
  //   );
  // }

  public static void main(String[] args) {
    Scoop scoop1 = new Scoop(Flavour.STRAWBERRRY, Size.HUGE);
    Scoop scoop2 = new Scoop(Flavour.LEMON, Size.HUGE);
    Scoop scoop3 = new Scoop(Flavour.VANILLA, Size.MODERATE);

    IceCream myIceCream = new IceCream(scoop1, scoop2, scoop3);

    System.out.println(myIceCream);
  }
}
