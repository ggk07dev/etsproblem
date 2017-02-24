package deckofcards;
/**
 * This class represents a deck of cards. A deck starts with 52 cards. A deck may be
 * shuffled (i.e. randomly mix up the order of the cards in the deck). The cards
 * in a deck may be dealt one by one from the deck.
 *
 * @author Georges Kfoury
 * @version 1.0
 */

public class DeckOfCards {
	
	/**
     * An array which contains the 52 cards of the deck.
     */
	private Card[] deckOfCards;
	
	/**
     * An int that keeps track of the number of cards that have been dealt from
     * the deck so far.
     */
	private int cardsUsed;
	
	/**
     * Constructs a deck of playing cards, The deck contains
     * 52 cards and initially the cards are in a sorted order. 
     */
	public DeckOfCards() {
		deckOfCards = new Card[52];
		
		int cardCt = 0;
				
		for (Suits s : Suits.values()) {
		    for (Ranks r : Ranks.values()) {
		    	deckOfCards[cardCt++] = new Card(s,r);
		    }  
		}
	} 
	
	/**
     * This puts all the used cards back into the deck (if any), and
     * shuffle the deck into a random order. (Knuth's shuffle)
     */
	public void shuffle() {
		for (int i = deckOfCards.length-1; i>0;i--) {
			int rand = (int)(Math.random()*(i+1));
			Card temp = deckOfCards[i];
			deckOfCards[i] = deckOfCards[rand];
			deckOfCards[rand] = temp;
		}
		cardsUsed = 0;
	}
		
	/**
     * This removes the next card from the deck and return it.  It is illegal
     * to call this method if there are no more cards in the deck.
     * @return the card which is removed from the deck.
     * @throws IllegalStateException if there are no cards left in the deck
     */
	public Card dealOneCard() {
		if(cardsUsed == deckOfCards.length) 
			throw new IllegalStateException("No cards are left in the deck.");
		cardsUsed++;
		return deckOfCards[cardsUsed-1];	
	}
	
	/**
	 * This returns a representation of the deck of cards 
	 * @return value contains only letters
	 */
	public String toString() {
		String deckOfCardsName = "";
		for(int i=0;i<deckOfCards.length;i++) {
			deckOfCardsName += deckOfCards[i];
		}
		return deckOfCardsName;
	}
}
