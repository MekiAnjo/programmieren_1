import java.util.HashMap;

public class CandyShop {

  private HashMap<Long, Candy> candyStorage;

  CandyShop() {
    candyStorage = new HashMap<>();
  }

  public void putCandy(long artNum, Candy candy) {
    candyStorage.put(artNum, candy);
  }

  public void removeCandy(long artNum, Candy candy) {
    candyStorage.remove(artNum);
  }

  public void clearShop() {
    candyStorage.clear();
  }

  public HashMap<Long, Candy> getCandyStorage() {
    return candyStorage;
  }

  public static void main(String[] args) {
    Candy haribo = new Candy("Haribo", 2.99);
    Candy kinder = new Candy("Kinderschokolade", 3.99);

    CandyShop shop = new CandyShop();

    shop.putCandy(12345, kinder);
    shop.putCandy(6678913, haribo);
  }
}
