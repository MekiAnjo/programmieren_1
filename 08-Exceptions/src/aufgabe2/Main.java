package aufgabe2;

import aufgabe2.Bankkonto.InvalidMoneyException;

public class Main {

  public static void main(String[] args) throws InvalidMoneyException {
    Bankkonto meinKonto = new Bankkonto();

    try {
      meinKonto.geldGutschreiben(-100);
    } catch (InvalidMoneyException e) {
      e.printStackTrace();
    }

    meinKonto.geldAbheben(101);
  }
}
