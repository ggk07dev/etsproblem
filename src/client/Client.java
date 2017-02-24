package client;
import deckofcards.Card;
import deckofcards.DeckOfCards;

/**
 * This class is used for testing the Card and DeckOfCard classes
 * @author Georges Kfoury
 * @version 1.0
 */
public class Client {
	/**
	 * Validates the implementation of the Deck of Cards problem
	 */
	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards();
		System.out.println(deck);
		
		Card card = deck.dealOneCard();
		System.out.println(card);
		
		deck.shuffle();
		System.out.println(deck);

		Card card2 = deck.dealOneCard();
		System.out.println(card2);
	}
	
}
