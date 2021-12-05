import java.util.LinkedList;
import java.util.ListIterator;

public class Fruit {

  private String name;

  @Override
  public String toString() {
    return "Fruit [name=" + name + ", colour=" + colour + "]";
  }

  private String colour;

  public Fruit(String name, String colour) {
    super();
    this.name = name;
    this.colour = colour;
  }

  public String getName() {
    return name;
  }

  public String getColour() {
    return colour;
  }

  public static void main(String[] args) {
    Fruit apple = new Fruit("Apfel", "grün");
    Fruit banana = new Fruit("Banane", "gelb");
    Fruit strawberry = new Fruit("Erdbeere", "rot");
    Fruit grape = new Fruit("Traube", "grün");
    Fruit kiwi = new Fruit("Kiwi", "grün");

    LinkedList<Fruit> fruitSkewer = new LinkedList<>();

    fruitSkewer.add(grape);
    fruitSkewer.add(apple);
    fruitSkewer.add(strawberry);
    fruitSkewer.add(grape);
    fruitSkewer.add(banana);
    fruitSkewer.add(banana);

    //		for (int j = 0; j < fruitSkewer.size(); j++) {
    //			for (int i = 0; i < fruitSkewer.size(); i++) {
    //				if (fruitSkewer.get(j).equals(fruitSkewer.get(i)) && i != j) {
    //					fruitSkewer.remove(i);
    //				}
    //			}
    //		}

    ListIterator<Fruit> it = fruitSkewer.listIterator();

    while (it.hasNext()) {
      int i = it.nextIndex();
      Fruit current = it.next();
      for (int j = 0; j < i; ++j) {
        if (current.equals(fruitSkewer.get(j))) {
          it.remove();
          break;
        }
      }
    }

    for (Fruit fruit : fruitSkewer) {
      System.out.println(fruit);
    }

    for (Fruit fruit : fruitSkewer) {
      if (fruit.getName() == "Apfel") {
        System.out.println(true);
      }
    }
  }
}
