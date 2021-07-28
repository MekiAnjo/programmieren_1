package deck_of_cards;

public class Pack {

  private Card[] cards;

  public Pack() {
    build();
  }

  public Card[] getCards() {
    return cards;
  }

  private void build() {
    cards = new Card[52];
    String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
    int i = 0;
    for (String suit : suits) {
      for (int rank = Card.MIN_VALUE; rank <= Card.MAX_VALUE; rank++) {
        cards[i] = new Card(suit, rank);
        i++;
      }
    }
  }
}
