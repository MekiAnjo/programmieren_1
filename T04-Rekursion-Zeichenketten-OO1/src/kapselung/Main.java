package kapselung;

public class Main {

  public static void main(String[] args) {
    Cat cat = new Cat();

    cat.feed();
    cat.play();
    cat.sleep();
    System.out.println(cat.getEnergyLevel());
    System.out.println(cat.getHungerLevel());
    System.out.println(cat.getMood());
  }
}
