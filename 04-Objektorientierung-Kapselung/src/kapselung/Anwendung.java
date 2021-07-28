package kapselung;

public class Anwendung {

  public static void main(String[] args) {
    Katze cat = new Katze();

    cat.feed();
    cat.play();
    cat.sleep();
    System.out.println(cat.getEnergy());
    System.out.println(cat.getHungry());
    System.out.println(cat.getMood());
  }
}
