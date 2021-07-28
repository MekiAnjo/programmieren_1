package deck_of_cards;

public class Deck {

  private Card[] cards;
  public Deck(Pack pack) {
    this.cards = pack.getCards();
  }

  public Card[] getCards() {
    return cards;
  }

  public int remainingCards() {
    return cards.length;
  }
}
