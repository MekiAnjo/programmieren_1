package kapselung;

public class Cat {

  private int mood = 50;
  private int hungry = 50;
  private int energy = 50;

  public void feed() {
    System.out.println("Feed ...");
    hungry--;
    mood++;
    meow();
  }

  public int getMood() {
    return this.mood;
  }

  public int getHungry() {
    return this.hungry;
  }

  public int getEnergy() {
    return this.energy;
  }

  private void meow() {
    System.out.println("MEOW! :3");
  }

  public void play() {
    System.out.println("Play ...");
    mood++;
    energy--;
    meow();
  }

  public void sleep() {
    System.out.println("Sleep ...");
    energy++;
    hungry++;
  }
}
