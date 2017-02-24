package deckofcards;
/**
 * This class consists of a card which is used in the deck of cards
 * @author Georges Kfoury
 * @version 1.0
 */
public class Card {
	/**
     * The suit of the card
     */
	private Suits suit;
	/**
     * The rank of the card
     */
	private Ranks rank;
	
	/**
	 * This constructs a Card with a specified suit and rank
	 * @param suit the suit of the card
	 * @param rank the rank of the card
	 */
	public Card(Suits suit, Ranks rank) {
	    this.suit = suit;
	    this.rank = rank;
	}

	/**
	 * This returns a representation of the card that includes its suit and rank
	 * @return value contains only letters
	 */
	public String toString() {
		return String.format("%1$s of %2$s\n", rank, suit);
	}

}
