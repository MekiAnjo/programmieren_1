package assoziativspeicher;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class RandomIterator implements Iterator<Integer> {

  private final Random random = new Random();
  private final int bound;

  //Konstruktor für Iterator

  public RandomIterator(int bound) {
    this.bound = bound;
  }

  @Override
  public boolean hasNext() {
    return true;
  }

  @Override
  public Integer next() {
    if (!hasNext()) throw new NoSuchElementException();
    return random.nextInt(bound); // 0 inklusive, bound exklusive
  }
}
