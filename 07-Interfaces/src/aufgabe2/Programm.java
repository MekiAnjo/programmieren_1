package aufgabe2;

public class Programm {

  public static void main(String[] args) {
    Car[] cars = new Car[5];

    cars[0] = new Audi("Audi A4", 170, 0, 0);
    cars[1] = new Audi("Audi A7", 330, 0, 0);
    cars[2] = new Tesla("model 3", 200, 10, 10);
    cars[3] = new Tesla("model S", 400, 20, 20);
    cars[4] = new Tesla("model X", 360, 30, 30);

    cars[3].printPosition();
    cars[3].drive(100, 100);
    cars[3].printPosition();
  }
}
