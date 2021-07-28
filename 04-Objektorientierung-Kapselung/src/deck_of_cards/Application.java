package deck_of_cards;

public class Application {

  public static void main(String[] args) {
    Pack cp = new Pack();
    Deck deck = new Deck(cp);

    System.out.println("Remaining cards: " + deck.remainingCards());

    for (Card card : deck.getCards()) {
      System.out.println(card.getSuit() + " " + card.getValue());
    }
  }
}
