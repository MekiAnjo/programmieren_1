package animals;

import java.util.Arrays;

public class Ant extends Insect {

  private boolean isQueen;

  Ant(String name, int age, int legCount, boolean isQueen) {
    super(name, age, legCount);
    this.isQueen = isQueen;
  }

  public boolean isQueen() {
    return isQueen;
  }

  @Override
  public void attack() {
    System.out.println("Ameisenarmee greift anderes Insekt an.");
  }

  @Override
  public void move() {
    System.out.println(this.getName() + " krabbelt.");
  }

  @Override
  public String toString() {
    return "Name: " + this.getName() + "\nAlter: " + this.getAge() + "\nusw.";
  }

  //void work()

  public static void main(String[] args) {
    Animal ant1 = new Ant("jhj", 9, 6, true);

    Ant ant = new Ant("Fido", 1, 6, false);

    System.out.println(ant);
  }
}
