package kapselung;

public class Cat {

  private int mood = 50;
  private int hungerLevel = 50;
  private int energyLevel = 50;

  public void feed() {
    System.out.println("Feed ...");
    hungerLevel--;
    mood++;
    meow();
  }

  public int getMood() {
    return this.mood;
  }

  public int getHungerLevel() {
    return this.hungerLevel;
  }

  public int getEnergyLevel() {
    return this.energyLevel;
  }

  private void meow() {
    System.out.println("MEOW! :3");
  }

  public void play() {
    System.out.println("Play ...");
    mood++;
    energyLevel--;
    meow();
  }

  public void sleep() {
    System.out.println("Sleep ...");
    energyLevel++;
    hungerLevel++;
  }
}
