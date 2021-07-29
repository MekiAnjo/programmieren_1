package bibliothekssoftware;

import static bibliothekssoftware.Bibliothek.getRandomBookTitles;
import static bibliothekssoftware.Bibliothek.printLendingList;

/**
 * Schalter
 */
public class Schalter {

  public static void main(String[] args) {
    Bibliothek station1 = new Bibliothek();

    station1.rentABook("Orientalism");
    station1.rentABook("Orientalism");
    station1.rentABook("Orientalismasasa");


    for (int i = 0; i < 10; i++) {
      station1.rentABook(getRandomBookTitles());
    }
    printLendingList();
    System.out.println();

    var station2 = new Bibliothek();
    for (int i = 0; i < 10; i++) {
      station2.rentABook(getRandomBookTitles());
    }
    printLendingList();
  }
}
