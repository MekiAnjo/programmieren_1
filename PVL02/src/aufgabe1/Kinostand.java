package aufgabe1;

public class Kinostand {

  public static void main(String[] args) {
    Kinderfilm frozen = new Kinderfilm("Frozen", 102, 0, true);
    Actionfilm dune = new Actionfilm("Dune", 155, 12, "3D");

    KinoBesucherIn johnny = new KinoBesucherIn("Johnny", 9, true);
    KinoBesucherIn harry = new KinoBesucherIn("Harry", 11, true);
    KinoBesucherIn alex = new KinoBesucherIn("Alex", 24, false);
    KinoBesucherIn isa = new KinoBesucherIn("Isa", 15, false);

    johnny.filmBesuchen(dune);
    harry.filmBesuchen(frozen);
    alex.filmBesuchen(dune);
    isa.filmBesuchen(frozen);
  }
}
