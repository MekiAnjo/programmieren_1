package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainProgram {

  public static void main(String[] args) {
    LinkedList<Fruit> fruitSkewer = new LinkedList<>();

    Fruit strawberry = new Fruit("Strawberry", "red");
    Fruit blueberry = new Fruit("Blueberry", "blue");
    Fruit lime = new Fruit("Lime", "green");
    Fruit orange = new Fruit("orange", "orange");
    Fruit apple = new Fruit("Apfel", "Rot");

    fruitSkewer.addFirst(strawberry);
    fruitSkewer.addLast(blueberry);

    System.out.println("Content of Skewer: " + fruitSkewer);
    // fruitSkewer.add(new Fruit("Lime", "green"));
    // fruitSkewer.add(new Fruit("orange", "orange"));

    addToSkewer(fruitSkewer, blueberry);
    System.out.println("Content of Skewer: " + fruitSkewer);

    addToSkewer(fruitSkewer, lime);
    addToSkewer(fruitSkewer, orange);
    System.out.println("Content of Skewer: " + fruitSkewer);

    addToSkewer(fruitSkewer, apple);

    fruitSkewer
      .stream()
      .filter(x -> x.getName().equals("Apfel"))
      .forEach(x -> System.out.println(x + " ist im Skewer vorhanden"));
  }

  public static void addToSkewer(List<Fruit> skewer, Fruit fruit) {
    Iterator<Fruit> iter = skewer.iterator();
    while (iter.hasNext()) {
      if (fruit.equals(iter.next())) {
        System.out.println(fruit + " is already on the skewer");
        return;
      }
    }
    System.out.println(fruit + " was added to the skewer");
    skewer.add(fruit);
  }
}
