package aufgabe2;

public class Bankkonto {

  private int guthaben;

  public void geldGutschreiben(int geldBetrag) throws InvalidMoneyException {
    if (geldBetrag < 0) {
      throw new InvalidMoneyException("Kein negativer Betrag");
    }
    this.guthaben += geldBetrag;
  }

  public int geldAbheben(int geldBetrag) throws InvalidMoneyException {
    if (geldBetrag > guthaben) {
      throw new InvalidMoneyException("Guthaben des Kontos nicht ausreichend");
    }
    this.guthaben -= geldBetrag;
    return geldBetrag;
  }

  public class InvalidMoneyException extends Exception {

    public InvalidMoneyException(String message) {
      super(message);
    }
  }
}
