package deck_of_cards;

public class Card {

  public static final int MIN_VALUE = 1;
  public static final int MAX_VALUE = 13;

  private boolean available;
  private String suit;
  private int value;

  public Card(String suit, int value) {
    this.suit = suit;
    this.value = value;
  }

  public void markAvailable() {
    this.available = true;
  }

  public void markUnavailable() {
    this.available = false;
  }

  @Override
  public String toString() {
    return (
      "Card{" +
      "available='" +
      available +
      "'" +
      ", suit='" +
      suit +
      "'" +
      ", value='" +
      value +
      "'" +
      "}"
    );
  }

  public String getSuit() {
    return this.suit;
  }

  public int getValue() {
    return this.value;
  }
}
